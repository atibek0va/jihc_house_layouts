package com.example.jihcgirlshouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class month_cal extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_cal);

        Spinner spinner = findViewById(R.id.spinner_month);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.groups, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}