package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity4 extends AppCompatActivity {


    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rbg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);

                switch (radioButton.getId()) {
                    case R.id.rb1: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "yes !!");
                        }
                    }
                    break;
                    case R.id.rb2: {
                        if (radioButton.isChecked()) {
                            Log.d("RD", "no !!");
                        }
                    }
                }

            }
        });

    }

}