package soft.x64bit.checker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button check = findViewById(R.id.check);
       final TextView arch = findViewById(R.id.arch);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String abi = System.getProperty("os.arch");
                if(abi.contains("64"))
                {
                    arch.setText("This device has 64 bit support");
                }
                else {
                    arch.setText("This Device won't support 64-bit apps");

                }
            }
        });
    }
}