package com.trizdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male:
                if (checked)

                    break;
            case R.id.radio_female:
                if (checked)

                    break;
            case R.id.radio_personal:
                if (checked)

                    break;
            case R.id.radio_org:
                if (checked)

                    break;
        }
    }

    public void activityAlmost(View view){
        Intent intent = new Intent(this,alomost_there.class);
        startActivity(intent);
    }
}