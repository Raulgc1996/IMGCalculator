package com.example.ral.actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MEnu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    public void  d5(View view){
        Intent intent = new Intent(this,IMGcalculator.class);
        startActivity(intent);
    }
    public void  d4(View view){
        Intent intent = new Intent(this,Help.class);
        startActivity(intent);
    }
    public void  d3(View view){
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }
}
