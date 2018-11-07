package com.example.ravirathee.a111_fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button but1 ,but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button1){
            Fragment fr;
            fr = new BlankFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.test, fr);
            fragmentTransaction.commit();
        }else
            {
            Fragment fr;
            fr = new BlankFragment2();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.test, fr);
            fragmentTransaction.commit();
        }


    }
}
