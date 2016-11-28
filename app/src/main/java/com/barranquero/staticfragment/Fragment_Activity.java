package com.barranquero.staticfragment;

import android.app.Activity;
import android.os.Bundle;

public class Fragment_Activity extends Activity implements Fragment_A.FragmentIterationListener {
    private Fragment_B fragment_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        fragment_b = (Fragment_B)getFragmentManager().findFragmentById(R.id.frgB);
    }


    @Override
    public void onFragmentIterationListener(String text, int size) {
        fragment_b.changeTextProperties(text, size);
    }
}
