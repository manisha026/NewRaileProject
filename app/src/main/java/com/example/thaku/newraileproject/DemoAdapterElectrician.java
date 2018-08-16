//package com.example.thaku.newraileproject;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.RatingBar;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class DemoAdapterElectrician extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    ArrayList<ModelClass> data;
//    Context context;
//
//    public DemoAdapterElectrician(Context context,ArrayList<ModelClass>data){
//        this.context=context;
//        this.data=data;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//DemoAdapterElectrician.MyViewHolder holder=new DemoAdapterElectrician.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.multiple_item,parent,false));
//        return holder;    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        DemoAdapterElectrician.MyViewHolder myviewHolder=(DemoAdapterElectrician.MyViewHolder)holder;
//
//
//        myviewHolder.name.setText(data.get(position).getname());
//        myviewHolder.single_phone.setText(data.get(position).getSingle_phone());
//        myviewHolder.single_location.setText(data.get(position).getSingle_location());
//        myviewHolder.single_requirement.setText(data.get(position).getSingle_requirement());
//        myviewHolder.single_share.setText(data.get(position).getSingle_share());
//        myviewHolder.single_profile.setImageResource(data.get(position).getSingle_profile());
//        myviewHolder.single_electrical.setImageResource(data.get(position).getSingle_electrical());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return data.size();
//    }
//
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        ImageView image_view, share, call, message;
//        RatingBar rating_bar;
//        TextView name, five, share_text, time, open, sector;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//
//            image_view = itemView.findViewById(R.id.image_view);
//            share = itemView.findViewById(R.id.share);
//            call = itemView.findViewById(R.id.call);
//            message = itemView.findViewById(R.id.message);
//            rating_bar = itemView.findViewById(R.id.rating_bar);
//            five = itemView.findViewById(R.id.five);
//            share_text = itemView.findViewById(R.id.share_text);
//            open = itemView.findViewById(R.id.open);
//            sector = itemView.findViewById(R.id.sector);
//
//        }
//    }
//}
