package com.moochiking.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button firstBtn , exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = (Button) findViewById(R.id.button1);
        exitBtn = (Button) findViewById(R.id.button2);

        firstBtn.setOnClickListener(this);
        exitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button1){
            startFirst();
        }

        else if (id == R.id.button2){
            Toast.makeText(this , "Exit Main Activity" , Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void startFirst(){
        Intent launchIntent = new Intent(this, FirstActivity.class);
        startActivity(launchIntent);
    }
}