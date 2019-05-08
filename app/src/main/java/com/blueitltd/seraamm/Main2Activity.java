package com.blueitltd.seraamm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Main2Activity extends AppCompatActivity {

    LinearLayout mylinearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mylinearlayout=findViewById(R.id.mylinearlayout);
        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);

        View vi=  inflater.inflate(R.layout.singlefileviewer,null,false);

        for(int i=0;i<5;i++){

            mylinearlayout.addView(vi);
        }

    }
}
