package com.barranquero.staticfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment_Activity extends AppCompatActivity implements Fragment_A.FragmentIterationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public void onFragmentIterationListener(String text, int size) {
        
    }
}
