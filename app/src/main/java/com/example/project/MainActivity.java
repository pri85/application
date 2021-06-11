package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import com.example.project.adapter.ParentRecyclerViewAdapter;
import com.example.project.adapter.SliderAdapter;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter ParentAdapter;
    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManager;
    Toolbar toolbar;

    String url1 = "https://i.ytimg.com/vi/pJ9uLccnOVQ/maxresdefault.jpg";
    String url2 = "https://m.media-amazon.com/images/M/MV5BMDc3MjY0NzEtYzBmOS00NGRlLWFjNmMtMjlmNzAwNDZlNjgyXkEyXkFqcGdeQXVyODY5MDc4OTg@._V1_.jpg";
    String url3 = "https://i.ytimg.com/vi/IRc9fMoSk08/hqdefault.jpg?sqp=-oaymwEjCPYBEIoBSFryq4qpAxUIARUAAAAAGAElAADIQj0AgKJDeAE=&rs=AOn4CLB7GFZyVaxA6g78FXlZ8j2ypPM2Jg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbarCustom);
        //setSupportActionBar(toolbar);
        toolbar.setTitle(null);
        //set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(new ParentModel("Series"));
        parentModelArrayList.add(new ParentModel("Non Fiction"));
        parentModelArrayList.add(new ParentModel("Exclusive"));
        parentModelArrayList.add(new ParentModel("Musicals"));
        parentModelArrayList.add(new ParentModel("Shorts"));
        parentModelArrayList.add(new ParentModel("Lyricals"));
        parentRecyclerView = findViewById(R.id.Parent_recyclerView);
        parentRecyclerView.setHasFixedSize(true);
        parentLayoutManager = new LinearLayoutManager(this);
        ParentAdapter = new ParentRecyclerViewAdapter(parentModelArrayList, MainActivity.this);
        parentRecyclerView.setLayoutManager(parentLayoutManager);
        parentRecyclerView.setAdapter(ParentAdapter);
        ParentAdapter.notifyDataSetChanged();

        // we are creating array list for storing our image urls.
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();

    }
}

