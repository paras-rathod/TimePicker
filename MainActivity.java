package com.example.paras.timepicker;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view)
    {
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getFragmentManager(),"time_picker");


    }
}
