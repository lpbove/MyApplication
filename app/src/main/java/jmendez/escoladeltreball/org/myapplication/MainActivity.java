package jmendez.escoladeltreball.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    Added by me today
    TEST PUSH
    TEST
     */

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_clickme);
        button2 = (Button) findViewById(R.id.lambda);

//        button.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "button clicked", Toast.LENGTH_LONG).show();
            }
        };

        button.setOnClickListener(listener);
        button.setOnClickListener((View view) -> Toast.makeText(getApplicationContext(),"mensaje con Lambda", Toast.LENGTH_LONG).show());
        button2.setOnClickListener((View view) -> Toast.makeText(getApplicationContext(),"segundo boton",Toast.LENGTH_LONG).show());
    }

//    public void btn_clickeOnClick(View view) {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_LONG).show();
//    }
}
