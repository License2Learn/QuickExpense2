package com.cs449.android.quickexpense2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_screen);
    }

    public void goto_Login(View view)
    {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
