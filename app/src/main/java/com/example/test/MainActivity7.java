package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity7 extends AppCompatActivity {


    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;

    private Button showBtn;
    private TextView showTV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=(CheckBox) findViewById(R.id.cb1);
        cb2= (CheckBox) findViewById(R.id.cb2);
        showBtn=(Button) findViewById(R.id.cbBtn);
        showTV=(TextView) findViewById(R.id.cbText);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb= new StringBuilder();
                sb.append(cb1.getText().toString()  + " : "+cb1.isChecked()+"  ");
                sb.append(cb2.getText().toString() +" " + cb2.isChecked());
                showTV.setVisibility(View.VISIBLE);
                showTV.setText(sb);
            }
        });

    }

}