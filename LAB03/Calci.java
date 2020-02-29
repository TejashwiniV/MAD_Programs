package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Num1;
    EditText Num2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.num1);
        Num2 = (EditText)findViewById(R.id.num2);
        Add = (Button)findViewById(R.id.add);
        Sub = (Button)findViewById(R.id.sub);
        Mul = (Button)findViewById(R.id.mul);
        Div = (Button)findViewById(R.id.div);
        Result = (TextView)findViewById(R.id.result);

        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";

        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
            return;

        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());

        switch (v.getId()) {
            case R.id.add:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.sub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.mul:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.div:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }
        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
