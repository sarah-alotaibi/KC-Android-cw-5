package com.example.myapplicationcw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button Button = findViewById(R.id.button);
        EditText editTextTextPersonNameEdt = findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editTextTextPersonName = editTextTextPersonNameEdt.getText().toString();
                int  editTextTextPersonName2 = Integer.parseInt(editTextTextPersonName2.getText().toSrting());
                Intent intent = new Intent(MainActivity .this, MainActivity2.class);
                intent.putExtra("name", editTextTextPersonName );
                intent.putExtra("age",editTextTextPersonName2 );
                startActivity(intent);



            }

        });
    }
}