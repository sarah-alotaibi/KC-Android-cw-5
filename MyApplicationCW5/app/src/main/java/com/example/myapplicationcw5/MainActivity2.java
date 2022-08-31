package com.example.myapplicationcw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView4TextView = findViewById(R.id.textView4Txt);
        TextView textView6TextView = findViewById(R.id.textView6Txt);
        Bundle bundle = getIntent().getExtras();


        String name = bundle.getString("name");
        textView4TextView.setText(name);

        String name = bundle.getString("age");
        ageTextView.setText(String.valueOf("age"));

    }
}