package com.pjm0922;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    InputMethodManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        EditText editText1 = findViewById(R.id.Edit1);
        EditText editText2 = findViewById(R.id.Edit2);
        TextView textView = findViewById(R.id.result2);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                String Edit1 = editText1.getText().toString();
                String Edit2 = editText2.getText().toString();

                if (Edit1.equals("") || Edit2.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(Edit1) + Integer.parseInt(Edit2);
                    textView.setText(Edit1 + " + " + Edit2 + " = " + result);
                    }
                }
            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                String Edit1 = editText1.getText().toString();
                String Edit2 = editText2.getText().toString();
                if (Edit1.equals("") || Edit2.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(Edit1) - Integer.parseInt(Edit2);
                    textView.setText(Edit1 + " - " + Edit2 + " = " + result);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                String Edit1 = editText1.getText().toString();
                String Edit2 = editText2.getText().toString();
                if (Edit1.equals("") || Edit2.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();
                }else {
                    int result = Integer.parseInt(Edit1) * Integer.parseInt(Edit2);
                    textView.setText(Edit1 + " * " + Edit2 + " = " + result);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                String Edit1 = editText1.getText().toString();
                String Edit2 = editText2.getText().toString();
                if (Edit1.equals("") || Edit2.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();}
                else if (Edit2.equals("0")) {
                    Toast.makeText(MainActivity.this, "0으로는 나눌수 없습니다", Toast.LENGTH_SHORT).show();
                }else {
                    float result = (float) Integer.parseInt(Edit1) / Integer.parseInt(Edit2);
                    String result2 = String.format("%.2f", result);
                    textView.setText(Edit1 + " / " + Edit2 + " = " + result2);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                String Edit1 = editText1.getText().toString();
                String Edit2 = editText2.getText().toString();
                if (Edit1.equals("") || Edit2.equals("")) {
                    Toast.makeText(MainActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();}
                else if (Edit2.equals("0")) {
                    Toast.makeText(MainActivity.this, "0으로는 나눌수 없습니다", Toast.LENGTH_SHORT).show();
                }else {
                    float result = (float) Integer.parseInt(Edit1) % Integer.parseInt(Edit2);
                    textView.setText(Edit1 + " % " + Edit2 + " = " + result);
                }
            }
        });
    }
}