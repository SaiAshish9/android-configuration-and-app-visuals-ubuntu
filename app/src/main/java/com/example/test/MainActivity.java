package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText editText;
    private SeekBar seekBar;
    private Button calcBtn;
    private TextView totalResTV;
    private TextView totalBillTV;
    private TextView textViewSB;
    private int sbPer;
    private float enteredBillFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.tipsTF);
        seekBar = (SeekBar) findViewById(R.id.tipsSB);
        calcBtn = (Button) findViewById(R.id.tipBtn);
        totalResTV = (TextView) findViewById(R.id.tipsRes);
        totalBillTV = (TextView) findViewById(R.id.tipsTB);
        textViewSB = (TextView) findViewById(R.id.textViewSB);

        calcBtn.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textViewSB.setText(String.valueOf(seekBar.getProgress()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {



            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                sbPer = seekBar.getProgress();
            }


        });

    }


    @Override
    public void onClick(View v) {
        calculate();
    }

    public void calculate() {
        float res = 0.0f;
        if (!editText.getText().toString().equals("")) {
            enteredBillFloat = Float.parseFloat(editText.getText().toString());
            res = enteredBillFloat * sbPer/100;
            totalResTV.setText("res : " + res);
            totalBillTV.setText("total bill:" + (enteredBillFloat + res));
        } else {
            Toast.makeText(MainActivity.this, "Please enter a bill amount", Toast.LENGTH_LONG).show();
        }


    }
}