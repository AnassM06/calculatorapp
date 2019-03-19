package com.example.addcalculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button multiplybutton = (Button) findViewById(R.id.multiplybutton);
        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                EditText FirstNumberEditText = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText SecondNumberEditText = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextview);

                int num1 = Integer.parseInt(FirstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(SecondNumberEditText.getText().toString());
                int result = num1 * num2;
                ResultTextView.setText(result +"");

        Button dividebutton = (Button) findViewById(R.id.dividebutton);
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNumberEditText = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText SecondNumberEditText = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextview);

                int num1 = Integer.parseInt(FirstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(SecondNumberEditText.getText().toString());
                int result = num1 / num2;
                ResultTextView.setText(result +"");

        Button addbutton = (Button) findViewById(R.id.addbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNumberEditText = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText SecondNumberEditText = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextview);

                int num1 = Integer.parseInt(FirstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(SecondNumberEditText.getText().toString());
                int result = num1 + num2;
                ResultTextView.setText(result +"");

        Button subtractbutton = (Button) findViewById(R.id.subtractbutton);
        subtractbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNumberEditText = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText SecondNumberEditText = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextview);

                int num1 = Integer.parseInt(FirstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(SecondNumberEditText.getText().toString());
                int result = num1 - num2;
                ResultTextView.setText(result +"");
            }
        });
            }
        });
            }
        });

            }
        });
    }
}
