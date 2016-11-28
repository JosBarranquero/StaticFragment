package com.barranquero.staticfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_B extends Fragment {
    private TextView txtFragmentB;

    public Fragment_B() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
        if (rootView != null) {
            txtFragmentB = (TextView)rootView.findViewById(R.id.txvText);
        }
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text", txtFragmentB.getText().toString());
        outState.putDouble("fontsize", txtFragmentB.getTextSize()/getResources().getDisplayMetrics().density);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            String text = savedInstanceState.getString("text");
            int fontSize = (int)savedInstanceState.getDouble("fontsize");
            changeTextProperties(text, fontSize);
        }
    }

    /**
     * Method which modifies the text and font size
     * @param text        The text to be displayed
     * @param fontSize    The font size
     */
    public void changeTextProperties(String text, int fontSize) {
        txtFragmentB.setText(text);
        txtFragmentB.setTextSize(fontSize);
    }
}
