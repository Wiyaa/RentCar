package com.example.pens.rentcar;


import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Created by User on 03/04/2017.
 */

public class ViewPagerAdapter  extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>{

    private ArrayList<String> rvData;
    private LayoutInflater inflater;
    private Context context;

    public ViewPagerAdapter(/*Context context,*/ ArrayList<String> inputData) {
        //this.context=context;
//        inflater = LayoutInflater.from(context);
        rvData = inputData;
        //this.rvData=inputData;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public RelativeLayout clickdetail;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            clickdetail = (RelativeLayout)v.findViewById(R.id.relative);
        }

        @Override
        public void onClick(View view) {
            context.startActivity(new Intent(context, Detail2Activity.class));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recview_item, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        holder.tvTitle.setText(rvData.get(position));
        holder.tvSubtitle.setText("Frau " + position);

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }

}
