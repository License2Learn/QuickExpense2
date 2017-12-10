package com.cs449.android.quickexpense2;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.UserManager;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import com.cs449.android.quickexpense2.R;
import com.cs449.helpers.InputValidation;
import com.cs449.modal.User;
import com.cs449.sql.DatabaseHelper;

public class AddExpense extends AppCompatActivity implements View.OnClickListener{

    private final AppCompatActivity activity = AddExpense.this;

    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutFood;
    private TextInputLayout textInputLayoutEntertainment;
    private TextInputLayout textInputLayoutTransportation;
    private TextInputLayout textInputLayoutClothes;
    private TextInputLayout textInputLayoutEducation;

    private TextInputEditText textInputEditTextFood;
    private TextInputEditText textInputEditTextEntertainment;
    private TextInputEditText textInputEditTextTransportation;
    private TextInputEditText textInputEditTextClothes;
    private TextInputEditText textInputEditTextEducation;

    private AppCompatButton SubmitExpense;

    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_expense);

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews() {

        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        textInputLayoutFood = (TextInputLayout) findViewById(R.id.textInputLayoutFood);
        textInputLayoutEntertainment = (TextInputLayout) findViewById(R.id.textInputLayoutEntertainment);
        textInputLayoutTransportation = (TextInputLayout) findViewById(R.id.textInputLayoutTransportation);
        textInputLayoutClothes = (TextInputLayout) findViewById(R.id.textInputLayoutClothes);
        textInputLayoutEducation = (TextInputLayout) findViewById(R.id.textInputLayoutEducation);

        textInputEditTextFood = (TextInputEditText) findViewById(R.id.textInputEditTextFood);
        textInputEditTextEntertainment = (TextInputEditText) findViewById(R.id.textInputEditTextEntertainment);
        textInputEditTextTransportation = (TextInputEditText) findViewById(R.id.textInputEditTextTransportation);
        textInputEditTextClothes = (TextInputEditText) findViewById(R.id.textInputEditTextClothes);
        textInputEditTextEducation = (TextInputEditText) findViewById(R.id.textInputEditTextEducation);

        SubmitExpense = (AppCompatButton) findViewById(R.id.SubmitExpense);
    }

    private void initListeners() {

        SubmitExpense.setOnClickListener(this);
    }

    private void initObjects() {

       // inputValidation = new InputValidation(activity);
        databaseHelper = new DatabaseHelper(activity);
    }

    @Override
    public void onClick(View v) {

        databaseHelper.updateExpenses(v.getId(), Float.parseFloat(textInputEditTextFood.getText().toString()), Float.parseFloat(textInputEditTextEntertainment.getText().toString()),
                Float.parseFloat(textInputEditTextTransportation.getText().toString()), Float.parseFloat(textInputEditTextClothes.getText().toString()),
                Float.parseFloat(textInputEditTextEducation.getText().toString()));

        Snackbar.make(nestedScrollView, getString(R.string.Success_message), Snackbar.LENGTH_LONG).show();
        emptyInputEditText();
    }

    private void emptyInputEditText() {

        textInputEditTextFood.setText(null);
        textInputEditTextEntertainment.setText(null);
        textInputEditTextTransportation.setText(null);
        textInputEditTextClothes.setText(null);
        textInputEditTextEducation.setText(null);
    }

}
