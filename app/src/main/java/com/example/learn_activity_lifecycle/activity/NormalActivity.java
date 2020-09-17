package com.example.learn_activity_lifecycle.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.learn_activity_lifecycle.R;
import com.example.learn_activity_lifecycle.databinding.ActivityNormalBinding;

public class NormalActivity extends AppCompatActivity {

    private ActivityNormalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNormalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}