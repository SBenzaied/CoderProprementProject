package com.lpiem.coderpropmarvelapp.View.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.lpiem.coderpropmarvelapp.R;

public class DetailComics extends AppCompatActivity {

    protected ImageView imageView;
    protected TextView title;
    protected TextView summary;
    protected TextView information;
    protected TextView credits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcomics);

        imageView       =       findViewById(R.id.Comicimage);
        title           =       findViewById(R.id.Comictitle);
        summary         =       findViewById(R.id.Comicsummary);
        information     =       findViewById(R.id.Comicinformation);
        credits         =       findViewById(R.id.Comiccredits);




    }
}