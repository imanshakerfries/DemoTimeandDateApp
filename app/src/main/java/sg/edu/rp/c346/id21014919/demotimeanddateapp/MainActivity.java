package sg.edu.rp.c346.id21014919.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate, btnDisplayTime, btnReset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.btnDisplayTime);
        tvDisplay = findViewById(R.id.tvDisplay);
        btnReset = findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setIs24HourView(true);

                tvDisplay.setText("Time is " + tp.getHour() + ":" + tp.getMinute());

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = dp.getYear();
                int month = dp.getMonth() + 1;
                int day = dp.getDayOfMonth();

                tvDisplay.setText("Date is " + day + "/" + month + "/" + year);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setIs24HourView(true);
                tp.setHour(00);
                tp.setMinute(00);
                dp.updateDate(2020, 0, 1);
            }
        });
    }
}