package com.example.danie.gettingstartedwithnavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment
    {


    public BFragment()
        {
        // Required empty public constructor
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
        {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        String value = BFragmentArgs.fromBundle(getArguments()).getCoolText();
        TextView textView = view.findViewById(R.id.textView2);
        textView.setText(value);
        Button button = view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
                {
                //Sætter vores action lig med den Action som AFragment har som er actionAFragmentToBFragment.
                NavDirections action = BFragmentDirections.actionBFragmentToAFragment();

                //Henter NavControlleren for MainActivity's NavHostFragment og navigerer med actionen ovenfor.
                Navigation.findNavController(v).navigate(action);
                }
            });
        // Inflate the layout for this fragment
        return view;
        }

    }
