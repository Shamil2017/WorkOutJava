package com.example.workoutjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        WorkoutDetailFragment frag = (WorkoutDetailFragment) fragmentManager.findFragmentById(R.id.detail_frag);

        frag.setWorkout(1);
    }
}