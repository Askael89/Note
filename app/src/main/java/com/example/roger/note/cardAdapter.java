package com.example.roger.note;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardHolder> {
    private ArrayList<itemCard> lista;

    public static class cardHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextTitle;
        public TextView mDate;

        public cardHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextTitle = itemView.findViewById(R.id.titleText);
            mDate = itemView.findViewById(R.id.fileDate);
        }
    }

    public cardAdapter(ArrayList<itemCard> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public cardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        cardHolder ch = new cardHolder(v);
        return ch;
    }

    @Override
    public void onBindViewHolder(@NonNull cardHolder holder, int position) {
        itemCard actualItem = lista.get(position);

        holder.mImageView.setImageResource(actualItem.getmImageResource());
        holder.mTextTitle.setText(actualItem.getmTextTitle());
        holder.mDate.setText(actualItem.getmDate());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
