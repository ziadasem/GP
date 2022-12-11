package com.example.graduationproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class ViewArt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_art);
        TabLayout tl = findViewById(R.id.tabLayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                String temp = Objects.requireNonNull(tab.getText()).toString();
                if(temp.equals("History")){
                    TextView tv = findViewById(R.id.the_starry_);
                    tv.setText(R.string.the_starry_);
                }
                else if (temp.equals("Discussion")){
                    TextView tv = findViewById(R.id.the_starry_);
                    tv.setText(R.string.lorem);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                String temp = Objects.requireNonNull(tab.getText()).toString();
                if(temp.equals("History")){
                    TextView tv = findViewById(R.id.the_starry_);
                    tv.setText(R.string.the_starry_);
                }
                else if (temp.equals("Discussion")){
                    TextView tv = findViewById(R.id.the_starry_);
                    tv.setText(R.string.lorem);
                }
            }


        });

    }
}