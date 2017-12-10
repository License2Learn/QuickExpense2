package com.cs449.android.quickexpense2;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cs449.modal.User;
import com.cs449.sql.DatabaseHelper;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

/**
 * Created by Adam on 11/24/2017.
 */

public class PieGraph extends AppCompatActivity {

    private float[] yData = {100, 50, 200, 80, 120};
    private String[] xData = {"Food", "Entertainment", "Transportation", "Clothes", "Education"};

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pie_screen);

        pieChart = (PieChart) findViewById(R.id.piegraph);

       // pieChart.setDescription("Expenses $");
        pieChart.setRotationEnabled(true);

        addDataSet();
    }

    private void addDataSet(){

        ArrayList<PieEntry> yEntrys = new ArrayList<>();
        ArrayList<String> xEntrys = new ArrayList<>();

        for (int i = 0; i < yData.length; i++){
            yEntrys.add(new PieEntry(yData[i], i));
        }

        for (int i = 1; i < xData.length; i++){
            xEntrys.add(xData[i]);
        }

        PieDataSet piedataSet = new PieDataSet(yEntrys, "Expense Types");
        piedataSet.setSliceSpace(2);
        piedataSet.setValueTextSize(12);

        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.CYAN);

        piedataSet.setColors(colors);

        Legend legend = pieChart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);

        PieData pieData = new PieData(piedataSet);
        pieChart.setData(pieData);
        pieChart.invalidate();
    }
}
