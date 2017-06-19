package com.holmusk.testapplication.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.holmusk.testapplication.R;

/**
 * Created by haipham on 19/6/17.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle inState) {
        super.onCreate(inState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();

        if (manager.findFragmentById(R.id.fragment) == null) {
            Fragment fragment = MainFragment.getInstance();

            manager.beginTransaction()
                .add(R.id.fragment, fragment, null)
                .addToBackStack(null)
                .commit();
        }
    }
}
