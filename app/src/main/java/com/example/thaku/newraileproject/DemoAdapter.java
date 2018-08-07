package com.example.thaku.newraileproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ModelClass> data;
    Context context;

    public DemoAdapter(Context context,ArrayList<ModelClass>data){
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        ModelClass modelClass=new ModelClass();
//        modelClass.getSingle_profile();
//        modelClass.getSingle_kumar();
//        modelClass.getSingle_location();
//        modelClass.getSingle_phone();
//        modelClass.getSingle_requirement();
//        modelClass.getSingle_share();
//        modelClass.getSingle_electrical();


        MyViewHolder holder=new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false));
        return holder;
//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myviewHolder=(MyViewHolder)holder;


        myviewHolder.single_kumar.setText(data.get(position).getSingle_kumar());
        myviewHolder.single_phone.setText(data.get(position).getSingle_phone());
        myviewHolder.single_location.setText(data.get(position).getSingle_location());
        myviewHolder.single_requirement.setText(data.get(position).getSingle_requirement());
        myviewHolder.single_share.setText(data.get(position).getSingle_share());
        myviewHolder.single_profile.setImageResource(data.get(position).getSingle_profile());
        myviewHolder.single_electrical.setImageResource(data.get(position).getSingle_electrical());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView single_profile,single_electrical;
        TextView single_kumar,single_phone,single_location,single_requirement,single_share;

        public MyViewHolder(View itemView) {
            super(itemView);

            single_profile=itemView.findViewById(R.id.single_profile);
            single_electrical=itemView.findViewById(R.id.single_electrical);
            single_kumar=itemView.findViewById(R.id.single_kumar);
            single_phone=itemView.findViewById(R.id.single_phone);
            single_location=itemView.findViewById(R.id.single_location);
            single_share=itemView.findViewById(R.id.single_share);
            single_requirement=itemView.findViewById(R.id.single_requirement);

        }
    }
}
