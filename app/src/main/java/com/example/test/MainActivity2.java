package com.example.test;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {


    private EditText enterM;
    private Button convertBtn;
    private TextView resultTV;

//    1m = 39.3701in

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterM = (EditText) findViewById(R.id.mEditText);
        resultTV = (TextView) findViewById(R.id.resultID);
        convertBtn = (Button) findViewById(R.id.button);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0.0;


                if (enterM.getText().chars().allMatch(Character::isAlphabetic)) {
                    resultTV.setVisibility(View.VISIBLE);
                    resultTV.setText(R.string.error_msg);
                    resultTV.setTextColor(Color.RED);

                } else {
                    double meterValue = Double.parseDouble(enterM.getText().toString());
                    result = meterValue * multiplier;
                    resultTV.setVisibility(View.VISIBLE);
//                resultTV.setText(Double.toString(result));
                    resultTV.setText(String.format("%.2f", result) + " inches");
                }
            }
        });

    }

}