package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView) findViewById(R.id.resSeek);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("1","1");
                result.setText(seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("2","2");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("3","3");
                if(seekBar.getProgress()>=7){
                    result.setTextColor(Color.RED);
                }
            }
        });


    }

}