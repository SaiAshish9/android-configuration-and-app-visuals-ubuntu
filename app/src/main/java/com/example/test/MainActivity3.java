package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity3 extends AppCompatActivity {

    private ImageButton btn;

    private View view;

    private int[] colors=new int[]{
       Color.CYAN,
       Color.YELLOW,
       Color.MAGENTA,
       Color.BLUE,
       Color.RED,
       Color.LTGRAY
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(ImageButton) findViewById(R.id.tryMe);
        view= (View) findViewById(R.id.windowViewId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int len=colors.length;
                Random r= new Random();
                int rno = r.nextInt(len);
                view.setBackgroundColor(colors[rno]);
            }
        });
    }

}