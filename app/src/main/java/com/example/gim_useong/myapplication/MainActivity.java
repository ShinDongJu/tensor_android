package com.example.gim_useong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.amazonaws.mobile.client.AWSMobileClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AWSMobileClient.getInstance().initialize(this).execute();
        setContentView(R.layout.activity_main);
    }
}
