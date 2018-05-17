package com.example.welcome.rao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class CardviewActivity extends AppCompatActivity {
    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List mFlowerList;
    Flower mFlowerData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        mRecyclerView = (RecyclerView) findViewById(R.id.recy);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(CardviewActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mFlowerList = new ArrayList<>();
        mFlowerData = new Flower("cup", getString(R.string.cup),
                R.drawable.card1);
      /* mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Carnation", getString(R.string.description_flower_carnation),
                R.drawable.carnation);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Tulip", getString(R.string.description_flower_tulip),
                R.drawable.tulip);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Daisy", getString(R.string.description_flower_daisy),
                R.drawable.daisy);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Sunflower", getString(R.string.description_flower_sunflower),
                R.drawable.sunflower);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Daffodil", getString(R.string.description_flower_daffodil),
                R.drawable.daffodil);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Gerbera", getString(R.string.description_flower_gerbera),
                R.drawable.gerbera);
        mFlowerList.add(mFlowerData);
        mFlowerData = new Flower("Orchid", getString(R.string.description_flower_orchid),
                R.drawable.orchid);*/
        Adapter myAdapter;
        myAdapter = new Adapter(CardviewActivity.this, mFlowerList);
        mRecyclerView.setAdapter(myAdapter);
    }
}