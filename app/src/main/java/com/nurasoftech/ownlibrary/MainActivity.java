package com.nurasoftech.ownlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.nurasoftech.add_and_uppercase.AddandUpperCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int res = AddandUpperCase.addition(this, 2, 3);
        String upperString = AddandUpperCase.upperCase(this, "nurasoft");

        Log.d("MainActivity", "Addition : "+res);
        Log.d("MainActivity", "UpperCase : "+upperString);
    }
}