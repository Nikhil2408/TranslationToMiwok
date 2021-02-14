package com.example.translationtomiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NumberActivity extends AppCompatActivity
{
    String numbers[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

    }
}