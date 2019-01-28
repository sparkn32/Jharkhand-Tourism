package com.example.jharkhand.tourism;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GAdapter1 extends BaseAdapter {

    private Context mContext;



    public GAdapter1(Context context)
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
            R.drawable.baid1,R.drawable.baid2, R.drawable.baid3,
            R.drawable.basukinath1,R.drawable.basukinath2,R.drawable.basukinath3,
            R.drawable.chhinna1,R.drawable.chhinna2,R.drawable.chhinna3,
            R.drawable.dewri1,R.drawable.dewri2,R.drawable.dewri3,
            R.drawable.jagan1,R.drawable.jagan2,R.drawable.jagan3,
            R.drawable.jharkhandi1,R.drawable.jharkhandi2,R.drawable.jharkhandi3,
            R.drawable.naulakha1,R.drawable.naulakha2,R.drawable.naulakha3,R.drawable.naulakha4,
            R.drawable.maluti1,R.drawable.maluti2,R.drawable.maluti3,
            R.drawable.sun1,R.drawable.sun2,R.drawable.sun3
            
         
    };
}
