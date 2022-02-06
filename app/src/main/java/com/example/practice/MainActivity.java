package com.example.practice;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import java.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.channels.AsynchronousFileChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void processPress(View view) throws IOException {

        //text view and edit text objects
        TextView tv;
        EditText et;

        //linking to xml
        tv = (TextView) findViewById(R.id.text_main);
        et = (EditText) findViewById(R.id.edit_infile);

        //counter to loop through indexes of array starting from 0
        int num_vals = 0;

        //file name input
        String infilename;
        infilename = et.getText().toString();

        //declaring an array that stores up to 100 elements
        double[] numbersArray = new double[300];

        // try to open the input file in the assets folder (using the assetsManager)
            AssetManager assetManager = getAssets();
            Scanner fsc = new Scanner(assetManager.open(infilename));

        //read from the file
          while(fsc.hasNext()) {
              numbersArray[num_vals] = fsc.nextDouble();
              num_vals++;
          }



                //printing to screen  using append to just add on to whatever is there
            for(int i = 0; i < num_vals; i++){
                tv.append(Math.abs(numbersArray[i]) + "\n");
            }
        Toast.makeText(MainActivity.this,
                "Added " + infilename+  " to the list.",Toast.LENGTH_SHORT).show();
            //calling the absolute distance method
          abs_distance_mean(numbersArray, num_vals);

    } // end processPress


    public void abs_distance_mean(double[] a, int num_vals)
    {

        // you write this. Use Math.abs() in this method
    } // end abs_distance_me

}
