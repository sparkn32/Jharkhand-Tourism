package com.example.jharkhand.tourism;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;



public class Gallery1 extends Activity {

    ImageView selectedImage;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery1);

        Gallery gallery1 = (Gallery)findViewById(R.id.gallery);
        selectedImage=(ImageView)findViewById(R.id.imageView);
        gallery1.setSpacing(1);
        final GAdapter1 galleryImageAdapter= new GAdapter1(this);
        gallery1.setAdapter(galleryImageAdapter);
        gallery1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				selectedImage.setImageResource(galleryImageAdapter.mImageIds[arg2]);
			}
		
        });
        

    }
}
