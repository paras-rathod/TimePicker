package com.example.paras.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;


public class TimeSettings implements TimePickerDialog.OnTimeSetListener {
    Context context;
     public TimeSettings(Context context)
    {
        this.context = context;

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Toast.makeText(context,"Selected time is : "+hourOfDay+ " Hours "+minute+" Minutes",Toast.LENGTH_LONG).show();
    }
}
