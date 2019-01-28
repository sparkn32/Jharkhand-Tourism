package com.example.jharkhand.tourism;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GAdapter5 extends BaseAdapter {

    private Context mContext;



    public GAdapter5(Context context)
    {
        mContext = context;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));

        i.setScaleType(ImageView.ScaleType.FIT_XY);

        return i;
    }

   public Integer[] mImageIds = {
            R.drawable.betla4,R.drawable.betla1, R.drawable.betla2,R.drawable.betla3,
            R.drawable.tata1,R.drawable.tata2,R.drawable.tata3,R.drawable.tata4,
            R.drawable.dalma1,R.drawable.dalma2,R.drawable.dalma3,R.drawable.dalma4     
    };
}
