package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sampleButton;
    EditText sampleEdit;
    TextView sampleText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleButton = (Button) findViewById(R.id.buttonNew);
        sampleEdit = (EditText) findViewById(R.id.editText);
        sampleText = (TextView) findViewById(R.id.textView);

        sampleButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = sampleEdit.getText().toString();
                sampleText.setText(result);
            }
        });
    }
}