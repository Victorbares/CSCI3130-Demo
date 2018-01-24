package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.acme.csci3130_demo.R;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private EditText mText1;
    private TextView mTextU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1= findViewById(R.id.button1);
        mText1 =  findViewById(R.id.editText1);
        mTextU = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextU.setText((mText1.getText()));
            }
        });


    }
}
