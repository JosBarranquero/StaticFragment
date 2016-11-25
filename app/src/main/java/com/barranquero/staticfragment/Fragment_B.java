package com.barranquero.staticfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

}
