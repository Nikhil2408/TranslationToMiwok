package com.example.translationtomiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersActivity(View view)
    {
        Intent intent=new Intent(this, NumberActivity.class);
        startActivity(intent);
    }

    public void openFamilyMembersActivity(View view)
    {

    }

    public void openColorsActivity(View view)
    {

    }

    public void openPhrasesActivity(View view)
    {

    }
}