package com.example.shomarsalavat.elii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt_title = findViewById(R.id.txt_title);
        final EditText edt_counter = findViewById(R.id.edt_counter);
        Button btncounter = findViewById(R.id.btncounter);
        Button btnreset = findViewById(R.id.btnreset);
        btncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = Integer.parseInt(edt_counter.getText().toString());
                if (counter < count){
                    counter++;
                    txt_title.setText("Tedade Salavat haye shoma = " + counter);
                } else {
                    txt_title.setText("Tedad Salavat haye shoma be andaze moshakhas shode resid");
                }
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                txt_title.setText("Reset Shod");
            }
        });
    }
}