package com.example.chatapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivitySignInBinding;
import com.example.chatapp.databinding.ActivitySignuptwoBinding;


public class Signuptwo extends AppCompatActivity {

    private ActivitySignuptwoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignuptwoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();


    }

    private void setListeners() {
        binding.signinback.setOnClickListener(v-> onBackPressed());
    }


}