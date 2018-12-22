package com.example.erik.navigationinsidefragmentblog;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button)view.findViewById(R.id.btn_change_bg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int red = (int) (Math.random()* 255);
                int green = (int) (Math.random()* 255);
                int blue = (int) (Math.random()* 255);

                getView().setBackgroundColor(Color.rgb(red, green, blue));
            }
        });

        return view;
    }

}
