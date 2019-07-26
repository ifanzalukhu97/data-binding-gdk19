package com.ifanjszalukhu.databindinggdk19;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.ifanjszalukhu.databindinggdk19.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setTitle("Raja Singa (2019)");
        binding.setOverview("Simba mengidolakan ayahnya, Raja Mufasa, dan mengambil hati takdir kerajaannya sendiri. Tetapi tidak semua orang di kerajaan itu merayakan kedatangan anaknya yang baru.");
    }
}
