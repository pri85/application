package com.example.project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project.ChildModel;
import com.example.project.ParentModel;
import com.example.project.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder>{
    private ArrayList<ParentModel> parentModelArrayList;
    public Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.Movie_category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ParentModel currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.movieCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();

        // added the first child row
        if (parentModelArrayList.get(position).movieCategory().equals("Series")) {
            arrayList.add(new ChildModel(R.drawable.awasaan,"Awasaan", "Rajat Kumar","Drama","Hindi","16+"));
            arrayList.add(new ChildModel(R.drawable.shepherd,"Shepherd","Kanisha Malhotra","Drama","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.madam,"Madam","Rajat Kumar","Musical","Hindi","15+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"The Penitents","Rajat Kumar","Drama","Hindi","16+"));

        }

        // added in second child row
        if (parentModelArrayList.get(position).movieCategory().equals("Non Fiction")) {
            arrayList.add(new ChildModel(R.drawable.matkifhod,"Matkiphod","Rajat Kumar","Drama","Hindi","16+"));
            arrayList.add(new ChildModel(R.drawable.lipsdontlie,"Lips Don't Lie","Rajat Kumar","Drama","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Shepherds From Hell","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.cokies,"Cookies","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Courtyard 704","Rajat Kumar","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Twosome","Saif Baidya","Drama","English","15+"));
        }

        // added in third child row
        if (parentModelArrayList.get(position).movieCategory().equals("Exclusive")) {
            arrayList.add(new ChildModel(R.drawable.oldesttheboldest,"The Oldest & The Boldest","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel(R.drawable.khanekedewaane,"Khane Ke Deewane","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Bollywood Gurukul","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.lipsdontlie,"Lips Don't lie","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Movie Name","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Movie Name","Rajat Kumar","Drama","English","18+"));
        }

        // added in fourth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Musicals")) {
            arrayList.add(new ChildModel(R.drawable.sia,"Sia","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel(R.drawable.maxresdefault,"Z43","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Devvada Mane","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Bhooter Bari","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.lipsdontlie,"Lips Don't lie","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.cokies,"Cookies","Rajat Kumar","Drama","English","18+"));

        }

        // added in fifth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Shorts")) {
            arrayList.add(new ChildModel(R.drawable.cokies,"Cookies","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel(R.drawable.gurukul,"Bollywood Gurukul","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Devvada Mane","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Bhooter Bari","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Movie Name","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Movie Name","Rajat Kumar","Drama","English","18+"));
        }

        // added in sixth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Lyricals")) {
            arrayList.add(new ChildModel(R.drawable.maxresdefault,"Z43","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel(R.drawable.lipsdontlie,"Lips Don't Lie","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Devvada Mane","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Bhooter Bari","Rajat Kumar","Drama","English","18+"));
            arrayList.add(new ChildModel( R.drawable.awasaan,"Movie Name","Kanisha Malhotra","Musical","Hindi","16+"));
            arrayList.add(new ChildModel( R.drawable.shepherd,"Movie Name","Rajat Kumar","Drama","English","18+"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter = new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }
}