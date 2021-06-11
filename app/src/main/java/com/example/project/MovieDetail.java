package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetail extends AppCompatActivity {

    ImageView imgMovie;
    TextView tvMovieName,tvDirector,tvGenre,tvLanguage,tvAgeLimit;


    Toolbar toolbar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        initViews();

        /*toolbar=findViewById(R.id.toolbarCustom2);
        setSupportActionBar(toolbar);
        toolbar.setTitle(Constants.childModel.getMovieName());*/
        textView.setText(Constants.childModel.getMovieName());
        //
        //setSupportActionBar(toolbar);
        //toolbar.setTitle(Constants.childModel.getMovieName());


        imgMovie.setImageResource(Constants.childModel.getHero_image());
        tvDirector.setText(Constants.childModel.getDirector());
        tvMovieName.setText(Constants.childModel.getMovieName());
        tvDirector.setText(Constants.childModel.getDirector());
        tvGenre.setText(Constants.childModel.getGenre());
        tvLanguage.setText(Constants.childModel.getLanguage());
        tvAgeLimit.setText(Constants.childModel.getAgeLimit());

    }

    private void initViews() {
        textView=findViewById(R.id.tvGemplex);
        imgMovie = findViewById(R.id.imgMovie);
        tvDirector=findViewById(R.id.tvDirector);
        toolbar = findViewById(R.id.toolbarCustom2);
        tvMovieName = findViewById(R.id.tvMovieName);
        tvGenre = findViewById(R.id.tvGenre);
        tvLanguage = findViewById(R.id.tvLanguage);
        tvAgeLimit=findViewById(R.id.tvAgeLimit);
    }
}