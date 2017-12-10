package com.cs449.android.quickexpense2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    private final AppCompatActivity activity = WelcomeActivity.this;

    private AppCompatButton to_login;
    private AppCompatButton to_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        initViews();
        initListeners();
    }

    private void initViews() {

        to_login = (AppCompatButton) findViewById(R.id.to_login);
        to_register = (AppCompatButton) findViewById(R.id.to_register);
    }

    private void initListeners() {

        to_login.setOnClickListener(this);
        to_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.to_login:
                //Navigate to LoginActivity
                Intent intentLogin = new Intent(activity, LoginActivity.class);
                startActivity(intentLogin);
                break;
            case R.id.to_register:
                // Navigate to RegisterActivity
                Intent intentRegister = new Intent(activity, RegisterActivity.class);
                startActivity(intentRegister);
                break;
        }
    }
}
