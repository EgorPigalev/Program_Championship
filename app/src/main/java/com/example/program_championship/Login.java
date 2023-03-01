package com.example.program_championship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void nextMain(View v)
    {
        startActivity(new Intent(this, Main.class));
    }

    public void nextRegister(View v)
    {
        startActivity(new Intent(this, Register.class));
    }
}