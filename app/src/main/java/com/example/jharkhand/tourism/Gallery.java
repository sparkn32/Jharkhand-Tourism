package com.example.jharkhand.tourism;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class Gallery extends Activity {

    private static final String[] TEXTS = { 
    	"Image #1", "Image #2", "Image #3", 
    	"Image #4", "Image #5", "Image #6", 
    	"Image #7", "Image #8", "Image #9",
    	"Image #10",
    	"Image #11", "Image #12", "Image #13", 
    	"Image #14", "Image #15", "Image #16", 
    	"Image #17", "Image #18", "Image #19",
    	"Image #20",
    	"Image #21", "Image #22", "Image #23", 
    	"Image #24", "Image #25", "Image #26", 
    	"Image #27", "Image #28", "Image #29",
    	"Image #30" };
    private static final int[] IMAGES = { 
    	R.drawable.baid1, R.drawable.baid2,R.drawable.baid3,
    	R.drawable.basukinath1,R.drawable.basukinath2,R.drawable.basukinath3,
    	R.drawable.betla1,R.drawable.betla2,R.drawable.betla3,R.drawable.betla4,
    	R.drawable.chhinna1,R.drawable.chhinna2,R.drawable.chhinna3,
    	R.drawable.dalma1, R.drawable.dalma2,R.drawable.dalma3,R.drawable.dalma4,
    	R.drawable.dewri1, R.drawable.dewri2,R.drawable.dewri3,
    	R.drawable.hundru1, R.drawable.hundru2,R.drawable.hundru3,
    	R.drawable.jagan1, R.drawable.jagan2,R.drawable.jagan3,
    	R.drawable.jubilee1, R.drawable.jubilee2,R.drawable.jubilee3,R.drawable.khandoli1
           };
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
 
        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher.setFactory(new ViewFactory() 
        {
            @Override
            public View makeView() {
                TextView textView = new TextView(Gallery.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });
 
        mTextSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        mTextSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);
 
        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Gallery.this);
                return imageView;
            }
        });
        mImageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        mImageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);
 
        onSwitch(null);
    }
 
    public void onSwitch(View view)
    {
        mTextSwitcher.setText(TEXTS[mPosition]);
        mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);
        mPosition = (mPosition + 1) % TEXTS.length;
    }
}
