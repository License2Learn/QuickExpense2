package com.cs449.android.quickexpense2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final AppCompatActivity activity = MainActivity.this;
    private AppCompatButton addExpense;
    private AppCompatButton deleteExpense;
    private AppCompatButton pieGraph;
    private AppCompatButton barGraph;
    private AppCompatButton editProfile;
    private AppCompatButton logOut;

    private AppCompatTextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
        String emailFromIntent = getIntent().getStringExtra("EMAIL");
        TextView textViewName = (TextView) findViewById(R.id.textViewName);
        textViewName.setText(emailFromIntent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(activity, "Quick Expense is a helpful app that can be used to record your personal expenses!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.viewUsers:
                startActivity(new Intent(this, ViewUsers.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initViews() {
        addExpense = (AppCompatButton) findViewById(R.id.addExpense);
        deleteExpense = (AppCompatButton) findViewById(R.id.deleteExpense);
        pieGraph = (AppCompatButton) findViewById(R.id.pieGraph);
        barGraph = (AppCompatButton) findViewById(R.id.barGraph);
        editProfile = (AppCompatButton) findViewById(R.id.editProfile);
        logOut = (AppCompatButton) findViewById(R.id.logOut);
    }
    private void initListeners() {
        addExpense.setOnClickListener(this);
        deleteExpense.setOnClickListener(this);
        pieGraph.setOnClickListener(this);
        barGraph.setOnClickListener(this);
        editProfile.setOnClickListener(this);
        logOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.addExpense:
                Intent intentAddExpense = new Intent(getApplicationContext(), AddExpense.class);
                startActivity(intentAddExpense);
                break;

            case R.id.deleteExpense:
                Intent intentDeleteExpense = new Intent(getApplicationContext(), DeleteExpense.class);
                startActivity(intentDeleteExpense);
                break;

            case R.id.barGraph:
                Intent intentBarGraph = new Intent(getApplicationContext(), BarGraph.class);
                startActivity(intentBarGraph);
                break;

            case R.id.pieGraph:
                Intent intentPieGraph = new Intent(getApplicationContext(), PieGraph.class);
                startActivity(intentPieGraph);
                break;

            case R.id.editProfile:
                Intent intentEditProfile = new Intent(getApplicationContext(), EditProfile.class);
                startActivity(intentEditProfile);
                break;

            case R.id.logOut:
                Intent intentLogOut = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intentLogOut);
                break;
        }
    }
}
