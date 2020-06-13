package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void CurrencyConverter(View view){
        Log.i("Info","Button Pressed");

        EditText editText =(EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInPounds = editText.getText().toString();
        double d = Double.parseDouble(amountInPounds);
        double amountInDol = d*1.3;
        String inNum= String.format("%.2f",amountInDol);

        Log.i("Amount In Dollars",inNum);
        Toast.makeText(this, amountInPounds+" Pound  Is  $"+ amountInDol, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}