package com.example.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click(View view)
    {
        if(view==findViewById(R.id.button3)) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction tns = manager.beginTransaction();
            tns.replace(R.id.frame2, new login());
            tns.commit();
        }

           if(view==findViewById(R.id.button4))
            {
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction tns=manager.beginTransaction();
                tns.replace(R.id.frame2, new User());
                tns.commit();

            }
        }
    }

