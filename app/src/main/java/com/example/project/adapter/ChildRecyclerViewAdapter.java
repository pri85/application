package com.example.project.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.ChildModel;
import com.example.project.Constants;
import com.example.project.MovieDetail;
import com.example.project.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChildRecyclerViewAdapter extends RecyclerView.Adapter<ChildRecyclerViewAdapter.MyViewHolder>{
    public ArrayList<ChildModel> childModelArrayList;
    Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView heroImage;
        public TextView movieName;

        public MyViewHolder(View itemView) {
            super(itemView);
            heroImage = itemView.findViewById(R.id.hero_image);
            movieName = itemView.findViewById(R.id.movie_name);
        }
    }

    public ChildRecyclerViewAdapter(ArrayList<ChildModel> arrayList, Context mContext) {
        this.cxt = mContext;
        this.childModelArrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ChildModel currentItem = childModelArrayList.get(position);
        holder.heroImage.setImageResource(currentItem.getHeroImage());
        holder.movieName.setText(currentItem.getMovieName());

        holder.itemView.setOnClickListener( v -> {
            Constants.childModel = currentItem;

            //Toast.makeText(cxt, ""+currentItem.getMovieName(), Toast.LENGTH_SHORT).show();
            cxt.startActivity(new Intent(cxt, MovieDetail.class));
        });

    }

    @Override
    public int getItemCount() {
        return childModelArrayList.size();
    }
}