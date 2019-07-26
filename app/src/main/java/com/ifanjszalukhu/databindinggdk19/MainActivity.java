package com.ifanjszalukhu.databindinggdk19;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.ifanjszalukhu.databindinggdk19.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // TODO 4: Rebuild Project

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // TODO 2: set current movie

        // TODO 5: set movie variable data binding values
    }
}
