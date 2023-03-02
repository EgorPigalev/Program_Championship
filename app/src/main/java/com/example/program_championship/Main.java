package com.example.program_championship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void nextMenu(View view)
    {
        startActivity(new Intent(this, Menu.class));
    }

    public  void nextProfile(View view)
    {
        startActivity(new Intent(this, Profile.class));
    }

    public void nextListen(View view)
    {
        startActivity(new Intent(this, Listen.class));
    }
}