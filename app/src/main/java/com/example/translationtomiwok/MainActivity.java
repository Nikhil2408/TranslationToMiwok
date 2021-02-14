package com.example.translationtomiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event Listener implementation for NumberActivity
        TextView numbersTextView=(TextView)findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        });

        //Event Listener implementation for FamilyActivity
        TextView familyTextView =(TextView) findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

        //Event Listener implementation for ColorsActivity
        TextView  colorsTextView=(TextView) findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               Intent intent=new Intent(MainActivity.this, ColorsActivity.class);
               startActivity(intent);
            }
        });

        //Event Listener implementation for PhrasesActivity
        TextView phrasesTextView=(TextView)findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }

}