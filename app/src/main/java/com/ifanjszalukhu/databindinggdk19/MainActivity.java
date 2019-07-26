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

        Movie currentMovie = new Movie(
                "Raja Singa (2019)",
                "Simba mengidolakan ayahnya, Raja Mufasa, dan mengambil hati takdir kerajaannya sendiri. Tetapi tidak semua orang di kerajaan itu merayakan kedatangan anaknya yang baru.",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/1TUg5pO1VZ4B0Q1amk3OlXvlpXV.jpg"
        );

        binding.setMovie(currentMovie);
    }
}
