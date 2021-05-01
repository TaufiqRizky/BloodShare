package com.trizdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alomost_there extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alomost_there);
    }
    public void activityVerify(View view){
        Intent intent = new Intent(this,verify.class);
        startActivity(intent);
    }
}