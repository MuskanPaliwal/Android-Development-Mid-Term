package com.example.androiddevelopmentmidterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = (TextView)findViewById(R.id.textView4);
        t2 = (TextView)findViewById(R.id.textView5);
        t3 = (TextView)findViewById(R.id.textView6);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            t1.setText(bundle.getString("Friends"));
            if (t1.getText().toString().equalsIgnoreCase("Hema")){
                t2.setText("20");
                t3.setText("Female");

            }
            else if (t1.getText().toString().equalsIgnoreCase("Amit")){
                t2.setText("21");
                t3.setText("Male");

            }
            else if (t1.getText().toString().equalsIgnoreCase("Ruchi")){
                t2.setText("21");
                t3.setText("Female");

            }
            else if (t1.getText().toString().equalsIgnoreCase("Divya")){
                t2.setText("21");
                t3.setText("Female");

            }
            else {
                t2.setText("21");
                t3.setText("Female");

            }
        }
    }
}
