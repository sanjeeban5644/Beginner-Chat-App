package com.example.chatapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp.databinding.ActivitySignInBinding;


public class SignIn extends AppCompatActivity {

    //TextView createnewaccount;
    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.createnewaccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Signupthree.class)));
    }
}