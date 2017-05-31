package com.example.paras.timepicker;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
//import java.text.DateFormat;
import java.util.Calendar;



public class DialogHandler extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        int minute = calendar.get(calendar.MINUTE);

        TimePickerDialog dialog;
        TimeSettings timeSettings = new TimeSettings(getActivity());

        dialog = new TimePickerDialog(getActivity(),timeSettings,hour,minute,DateFormat.is24HourFormat(getActivity()));

        return  dialog;

       // return super.onCreateDialog(savedInstanceState);
    }
}
