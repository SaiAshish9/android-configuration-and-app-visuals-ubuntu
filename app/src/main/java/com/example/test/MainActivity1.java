package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity1 extends AppCompatActivity {


//    private Button btn;

    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.mButton);
        mTextView = (TextView) findViewById(R.id.mTextView);
        mEditText = (EditText) findViewById(R.id.mEditText);

        mButton.setText(R.string.button_name);
//        btn = (Button) findViewById(R.id.button2);
//        btn.setText("hi 123");
//        btn.setBackgroundColor(Color.BLACK);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inp;

                inp = mEditText.getText().toString();

                mTextView.setVisibility(View.VISIBLE);
//                mTextView.setText(R.string.show_text);
                mTextView.setText(inp);
            }
        });

    }


//    public void showMe(View view){
//        mTextView.setVisibility(View.VISIBLE);
//        mTextView.setText(R.string.show_text);
//    }


}