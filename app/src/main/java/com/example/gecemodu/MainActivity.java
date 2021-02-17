package com.example.gecemodu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Switch switch1=(Switch)findViewById(R.id.switch1);
            int curretMode= AppCompatDelegate.getDefaultNightMode();

            if(curretMode==AppCompatDelegate.MODE_NIGHT_YES){
                    switch1.setChecked(true);
            }else{
                    switch1.setChecked(false);
            }

            switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if(isChecked){
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                        RestartAc();
                    }else{
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        RestartAc();
                    }
                }
            });
    }
    private void RestartAc(){
        Intent intent=getIntent();
        finish();
        startActivity(intent);
    }

}