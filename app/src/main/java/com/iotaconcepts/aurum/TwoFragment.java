package com.iotaconcepts.aurum;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class TwoFragment extends Fragment
{
    // Required empty public constructor
    public TwoFragment()
    {}

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View myInflatedView = inflater.inflate(R.layout.fragment_two, container, false);
        Button b1=(Button)myInflatedView.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());

                // Setting Dialog Title
                alertDialog.setTitle("Oops! Something went wrong!");

                // Setting Dialog Message
                alertDialog.setMessage("\n"
                        + "We are really sorry. Due to security issues, Maps feature of this app is disabled. We'll fix this soon. \n\n"
                + "You can still explore \'Symptoms and Diseases\' feature, which by the way is offline.");

                // If user clicks DECLINE
                alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                alertDialog.show();


                // TODO: Remove comment from the code below. Date: 10th Feb'16. Author: prasang.
                //startActivity(new Intent(getActivity(),MapsActivity2.class));
            }
        });
        return myInflatedView;
    }





}