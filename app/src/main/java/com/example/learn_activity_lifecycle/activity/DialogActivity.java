package com.example.learn_activity_lifecycle.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.learn_activity_lifecycle.R;
import com.example.learn_activity_lifecycle.databinding.ActivityDialogBinding;

public class DialogActivity extends AppCompatActivity {

    private ActivityDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}