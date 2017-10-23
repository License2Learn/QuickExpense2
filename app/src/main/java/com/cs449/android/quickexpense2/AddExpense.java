package com.cs449.android.quickexpense2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddExpense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_expense);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
