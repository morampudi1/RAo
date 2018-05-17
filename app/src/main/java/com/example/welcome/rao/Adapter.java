package com.example.welcome.rao;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Welcome on 5/17/2018.
 */

public class Adapter extends RecyclerView.Adapter {

    Context mcontext;
    List mFlowerList;
    ImageView mage;
    TextView Title;
    Adapter(Context mContext, List mFlowerList) {
        this.mcontext = mContext;
        this.mFlowerList = mFlowerList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview, parent, false);
        return new FlowerViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        return;
    }

    @Override
    public int getItemCount() {
        return mFlowerList.size();
    }
}
class FlowerViewHolder extends RecyclerView.ViewHolder {
    ImageView mage;
    TextView Title;

    FlowerViewHolder(View itemView) {
        super(itemView);

        mage = itemView.findViewById(R.id.ivImage);
        Title = itemView.findViewById(R.id.tvTitle);
    }
}
