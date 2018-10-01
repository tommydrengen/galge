package com.example.thomas.galge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BenytGalgelogik extends AppCompatActivity {
    Galgelogik gl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gl = new Galgelogik();
    }
}
