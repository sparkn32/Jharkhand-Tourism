package com.example.jharkhand.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Info20 extends Activity {
	Button b,b1;
	ImageButton ib;
	TextView tv;
	TextToSpeech tts;
	ViewFlipper vf;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info20);
		b=(Button)findViewById(R.id.button2);
		ib=(ImageButton)findViewById(R.id.imageButton1);
		tv=(TextView)findViewById(R.id.textView1);
		tv.setMovementMethod(new ScrollingMovementMethod());
		tts=new TextToSpeech(Info20.this,null);
		vf=(ViewFlipper)findViewById(R.id.viewFlipper1);
        vf.setFlipInterval(2000);
        vf.startFlipping();
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		ib.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data=tv.getText().toString();
				tts.setPitch(0);
				tts.setSpeechRate(0);
				tts.speak(data,TextToSpeech.QUEUE_FLUSH,null);
			}
		});
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Info20.this,Map20.class);
				startActivity(i);
			}
		});
	}

}
