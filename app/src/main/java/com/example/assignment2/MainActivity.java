package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView edit;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.enterNameButton);
        edit = (TextView) findViewById(R.id.nameView);
        name = (EditText) findViewById(R.id.name);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = name.getText().toString();
                edit.setText("Hello "+st);
            }
        });
    }
}