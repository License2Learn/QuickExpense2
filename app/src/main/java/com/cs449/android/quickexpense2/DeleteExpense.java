package com.cs449.android.quickexpense2;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.cs449.sql.DatabaseHelper;

/**
 * Created by Adam on 11/26/2017.
 */

public class DeleteExpense extends AppCompatActivity implements View.OnClickListener{

    private final AppCompatActivity activity = DeleteExpense.this;

    private NestedScrollView nestedScrollView;
    private DatabaseHelper databaseHelper;
    private AppCompatButton resetFood;
    private AppCompatButton resetEntertainment;
    private AppCompatButton resetTransportation;
    private AppCompatButton resetClothes;
    private AppCompatButton resetEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_expense);

        initObjects();
        initViews();
        initListeners();

    }

    private void initViews() {

        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        resetFood = (AppCompatButton) findViewById(R.id.resetFood);
        resetEntertainment = (AppCompatButton) findViewById(R.id.resetEntertainment);
        resetTransportation = (AppCompatButton) findViewById(R.id.resetTransportation);
        resetClothes = (AppCompatButton) findViewById(R.id.resetClothes);
        resetEducation = (AppCompatButton) findViewById(R.id.resetEducation);
    }

    private void initListeners() {

        resetFood.setOnClickListener(this);
        resetEntertainment.setOnClickListener(this);
        resetTransportation.setOnClickListener(this);
        resetClothes.setOnClickListener(this);
        resetEducation.setOnClickListener(this);
    }

    private void initObjects() {

        databaseHelper = new DatabaseHelper(activity);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.resetFood:

                databaseHelper.deleteData(v.getId(), "food" );
                Snackbar.make(nestedScrollView, getString(R.string.Success_Message), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.resetEntertainment:

                databaseHelper.deleteData(v.getId(), "entertainment");
                Snackbar.make(nestedScrollView, getString(R.string.Success_Message), Snackbar.LENGTH_LONG).show();
                break;
            case R.id.resetTransportation:

                databaseHelper.deleteData(v.getId(), "transportation");
                Snackbar.make(nestedScrollView, getString(R.string.Success_Message), Snackbar.LENGTH_LONG).show();
            case R.id.resetClothes:

                databaseHelper.deleteData(v.getId(), "clothes");
                Snackbar.make(nestedScrollView, getString(R.string.Success_Message), Snackbar.LENGTH_LONG).show();
            case R.id.resetEducation:

                databaseHelper.deleteData(v.getId(), "education");
                Snackbar.make(nestedScrollView, getString(R.string.Success_Message), Snackbar.LENGTH_LONG).show();
        }

    }
}