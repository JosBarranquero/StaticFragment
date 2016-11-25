package com.barranquero.staticfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class Fragment_A extends Fragment {
    private SeekBar skbFragmentA;
    private Button btnChange;
    private EditText edtText;
    private FragmentIterationListener mCallBack;

    public interface FragmentIterationListener {
        void onFragmentIterationListener(String text, int size);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallBack = (FragmentIterationListener)context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement FragmentIterationListener interface");
        }
    }

    public Fragment_A() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        if (rootView != null) {
            edtText = (EditText) rootView.findViewById(R.id.edtText);
            btnChange = (Button) rootView.findViewById(R.id.btnChange);
            btnChange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mCallBack.onFragmentIterationListener(edtText.getText().toString(), skbFragmentA.getProgress());
                }
            });
            skbFragmentA = (SeekBar) rootView.findViewById(R.id.skbScroll);
        }
        return rootView;
    }

}
