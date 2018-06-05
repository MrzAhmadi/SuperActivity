package com.mr.superactivityexample;

import android.os.Bundle;
import android.widget.Toast;

import com.mr.superactivity.SuperActivity;

public class MainActivity extends SuperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast("Easy :)");
        toast("Easy Long :)", Toast.LENGTH_LONG);

        log("Easy and Default Verbose Type , Tag is Log");
        logE("Error","Log Test for Error");

        logWTest(); // for test run code :)

        boolean newtwork = isInternetAvailable();

        prefWriteString(this,"Your Key","Your Value");

        toast(""+prefExist(this,"Your Key"));





    }
}
