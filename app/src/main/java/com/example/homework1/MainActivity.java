package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private EditText editText, theme, text;
   private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theme = findViewById(R.id.theme);
        text = findViewById(R.id.text1);
        editText = findViewById(R.id.et_value);
        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{editText.getText().toString()});
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, text.getText());
                startActivity(intent);
            }
        });
    }
}