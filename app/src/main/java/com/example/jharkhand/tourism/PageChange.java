package com.example.jharkhand.tourism;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PageChange extends Activity {
ImageButton iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv19,iv20,iv21;
Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		iv1=(ImageButton)findViewById(R.id.imageButton1);
		iv2=(ImageButton)findViewById(R.id.imageButton2);
		iv3=(ImageButton)findViewById(R.id.imageButton3);
		iv4=(ImageButton)findViewById(R.id.imageButton4);
		iv5=(ImageButton)findViewById(R.id.imageButton5);
		iv6=(ImageButton)findViewById(R.id.imageButton6);
		iv7=(ImageButton)findViewById(R.id.imageButton7);
		iv8=(ImageButton)findViewById(R.id.imageButton8);
		iv9=(ImageButton)findViewById(R.id.imageButton9);
		iv10=(ImageButton)findViewById(R.id.imageButton10);
		iv11=(ImageButton)findViewById(R.id.imageButton11);
		iv12=(ImageButton)findViewById(R.id.imageButton12);
		iv13=(ImageButton)findViewById(R.id.imageButton13);
		iv14=(ImageButton)findViewById(R.id.imageButton14);
		iv15=(ImageButton)findViewById(R.id.imageButton15);
		iv16=(ImageButton)findViewById(R.id.imageButton16);
		iv17=(ImageButton)findViewById(R.id.imageButton17);
		iv18=(ImageButton)findViewById(R.id.imageButton18);
		iv19=(ImageButton)findViewById(R.id.imageButton19);
		iv20=(ImageButton)findViewById(R.id.imageButton20);
		iv21=(ImageButton)findViewById(R.id.imageButton21);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Feedback.class);
				startActivity(i);
			}
		});
		iv1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info1.class);
				startActivity(i);
			}
		});
		iv2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info2.class);
				startActivity(i);
			}
		});
		iv3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info3.class);
				startActivity(i);
			}
		});
		iv4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info4.class);
				startActivity(i);
			}
		});
		iv5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info5.class);
				startActivity(i);
			}
		});
		iv6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info6.class);
				startActivity(i);
			}
		});	
		iv7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info7.class);
				startActivity(i);
			}
		});
		iv8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info8.class);
				startActivity(i);
			}
		});
		iv9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info9.class);
				startActivity(i);
			}
		});
		iv10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info10.class);
				startActivity(i);
			}
		});
		iv11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info11.class);
				startActivity(i);
			}
		});
		iv12.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info12.class);
				startActivity(i);
			}
		});
		iv13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info13.class);
				startActivity(i);
			}
		});
		iv14.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info14.class);
				startActivity(i);
			}
		});
		iv15.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info15.class);
				startActivity(i);
			}
		});
		iv16.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info16.class);
				startActivity(i);
			}
		});
		iv17.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info17.class);
				startActivity(i);
			}
		});
		iv18.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info18.class);
				startActivity(i);
			}
		});
		iv19.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info19.class);
				startActivity(i);
			}
		});
		iv20.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Info20.class);
				startActivity(i);
			}
		});
		iv21.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PageChange.this,Tab.class);
				startActivity(i);
			}
		});
		
	}

}
