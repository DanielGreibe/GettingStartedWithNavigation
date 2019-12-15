package com.example.danie.gettingstartedwithnavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment
    {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
        {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
                {
                //Sætter vores action lig med den Action som AFragment har som er actionAFragmentToBFragment.
                NavDirections action = AFragmentDirections.actionAFragmentToBFragment("Awesome New Text");

                //Henter NavControlleren for MainActivity's NavHostFragment og navigerer med actionen ovenfor.
                Navigation.findNavController(v).navigate(action);
                }
            });

        // Inflate the layout for this fragment
        return view;
        }

    }
