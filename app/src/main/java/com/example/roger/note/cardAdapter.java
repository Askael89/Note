package com.example.roger.note;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardHolder> {
    private ArrayList<itemCard> lista;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class cardHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextTitle;
        public TextView mDate;

        public cardHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextTitle = itemView.findViewById(R.id.titleText);
            mDate = itemView.findViewById(R.id.fileDate);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public cardAdapter(ArrayList<itemCard> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public cardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        cardHolder ch = new cardHolder(v, mListener);
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
