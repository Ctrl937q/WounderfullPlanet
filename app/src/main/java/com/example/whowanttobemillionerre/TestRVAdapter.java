package com.example.whowanttobemillionerre;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TestRVAdapter extends RecyclerView.Adapter<TestRVAdapter.Holder>{

    private LayoutInflater layoutInflater;
    private ArrayList<String> list1;
    Context context;


    public TestRVAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        list1 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list1.add("вопрос номер " + i);
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(layoutInflater.inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        ArrayList<Integer> arrayListBol = MainActivity.arrayListBool;
        holder.textView1.setText(list1.get(position));
        if (arrayListBol.get(position) == 1) {
            holder.recyclerImageView.setImageResource(R.drawable.galochka);
        } else holder.recyclerImageView.setImageResource(R.drawable.krestik1);
    }
    @Override
    public int getItemCount() {
        return list1.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        TextView textView1;
        ImageView recyclerImageView;

        public Holder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.text1);
            recyclerImageView = (ImageView) itemView.findViewById(R.id.recyclerImageView);
        }
    }
}


