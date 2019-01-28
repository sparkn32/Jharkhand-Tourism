package com.example.jharkhand.tourism;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {
	Button b;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        TextView tv1=(TextView)findViewById(R.id.textView1);
	        TextView tv2=(TextView)findViewById(R.id.textView2);
	        TextView tv3=(TextView)findViewById(R.id.textView3);
	        TextView tv4=(TextView)findViewById(R.id.textView4);
	        String fontPath2 = "fonts/Altoys.ttf";
	        Typeface tf2 = Typeface.createFromAsset(getAssets(), fontPath2);
	        tv1.setTypeface(tf2);
	        tv2.setTypeface(tf2);
	        tv3.setTypeface(tf2);
	        tv4.setTypeface(tf2);
	        b=(Button)findViewById(R.id.button1);
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					triggerNotification();
					Intent i=new Intent(MainActivity.this,PageChange.class);
					startActivity(i);
				}
			});
	        Button b2=(Button)findViewById(R.id.button2);
	        b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i1=new Intent(MainActivity.this,AboutUs.class);
					startActivity(i1);
				}
			});
	    }
	    private void triggerNotification() {
			String title="Jharkhand Tourism";
			String message="Hello,This app helps in giving information about tourists places in Jharkhand";
			NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
			Notification notification = new Notification(R.drawable.jh2,"Jharkhand Tourism!",1111);
			Intent notificationIntent=new Intent(this,MainActivity.class);
			PendingIntent pendingIntent =PendingIntent.getActivity(this,0, notificationIntent, 0);
			notification.setLatestEventInfo(MainActivity.this, title, message,pendingIntent);
			notificationManager.notify(11,notification);
			
		}

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }

	    
	}
