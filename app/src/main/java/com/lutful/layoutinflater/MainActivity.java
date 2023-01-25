package com.lutful.layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainLayout, myLayout;
    Button buttonAdd, buttonRemove;
    LayoutInflater layoutInflater;
    ImageView imgMusa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonRemove = findViewById(R.id.buttonRemove);
        myLayout = findViewById(R.id.myLayout);


        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.new_layout, mainLayout);

        View myView = layoutInflater.inflate(R.layout.new_layout, mainLayout);
        imgMusa = myView.findViewById(R.id.imgMusa);



     //   buttonAdd.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View v) {



                imgMusa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonAdd.setText("hello");
                    }
                });



                buttonRemove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myLayout.removeAllViews();
                    }
                });


            }
        };




