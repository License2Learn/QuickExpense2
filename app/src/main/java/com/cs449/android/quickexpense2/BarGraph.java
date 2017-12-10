package com.cs449.android.quickexpense2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;

/**
 * Created by Adam on 11/24/2017.
 */

public class BarGraph extends AppCompatActivity{

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_screen);

        barChart = (BarChart) findViewById(R.id.bargraph);
       // barChart.setDescription("Expenses $");

        ArrayList<String> expenses = new ArrayList<>();
        expenses.add("Food");
        expenses.add("Entertainment");
        expenses.add("Transportation");
        expenses.add("Clothes");
        expenses.add("Education");

        final String[] Expenses = new String[] { "FOOD", "ENTERTAINMENT", "TRANSPORTATION", "CLOTHES", "EDUCATION" };

        IAxisValueFormatter formatter = new IAxisValueFormatter() {

            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return Expenses[(int) value];
            }
        };

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(0f, 30f));
        barEntries.add(new BarEntry(1f, 10f));
        barEntries.add(new BarEntry(2f, 50f));
        barEntries.add(new BarEntry(3f, 80f));
        barEntries.add(new BarEntry(4f, 25f));
        BarDataSet barDataSet = new BarDataSet (barEntries, "expenses");

        BarData data = new BarData(barDataSet);
        barChart.setData(data);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);

        barChart.invalidate();
    }
}
