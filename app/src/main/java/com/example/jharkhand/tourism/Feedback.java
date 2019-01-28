package com.example.jharkhand.tourism;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class Feedback extends Activity implements OnClickListener{
	RatingBar rb;
	TextView tv; 
	EditText eName,eEmail,eCom;
	CheckBox chk;
	Button sf,vf,df;
	SQLiteDatabase db;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.feedback);
			rb=(RatingBar)findViewById(R.id.ratingBar1);
	        tv=(TextView)findViewById(R.id.textView6);
	        chk=(CheckBox)findViewById(R.id.checkBox1);
	        eName=(EditText)findViewById(R.id.editText1);
	        eEmail=(EditText)findViewById(R.id.editText2);
	        eCom=(EditText)findViewById(R.id.editText3);
	        sf=(Button)findViewById(R.id.button1);
	        vf=(Button)findViewById(R.id.button2);
	        df=(Button)findViewById(R.id.button3);
	        rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
				
				public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
					// TODO Auto-generated method stub
					tv.setText(String.valueOf(arg1));
				}
			});
	        sf.setOnClickListener(this);
	        vf.setOnClickListener(this);
	        df.setOnClickListener(this);
	        db=openOrCreateDatabase("FeedbackDB", Context.MODE_PRIVATE, null);
			db.execSQL("CREATE TABLE IF NOT EXISTS feedback1(eName VARCHAR,eEmail VARCHAR,tv Varchar,eCom VARCHAR,chk Boolean);");
		}
		 public void onClick(View view)
		 {
			 if(view==sf)
		    	{
		    		if(eName.getText().toString().trim().length()==0||
		    		   eEmail.getText().toString().trim().length()==0||
		    		   eCom.getText().toString().trim().length()==0)
		    		{
		    			showMessage("Error", "Please enter all values");
		    			return;
		    		}
		    		db.execSQL("INSERT INTO feedback1 VALUES('"+eName.getText()+"','"+eEmail.getText()+
		    				   "','"+tv.getText()+"','"+eCom.getText()+"','"+chk.isChecked()+"');");
		    		showMessage("Success", "Record added");
		    		clearText();
		    	}
			 
		    	if(view==df)
		    	{
		    		
		    		Cursor c=db.rawQuery("SELECT * FROM feedback1", null);
		    		if(c.moveToFirst())
		    		{
		    			db.execSQL("DELETE FROM feedback1");
		    			showMessage("Success", "Records Deleted");
		    		}
		    		else
		    		{
		    			showMessage("Error", "No Records Found");
		    		}
		    		
		    		clearText();
		    	}
		    	
		    	if(view==vf)
		    	{
		    		Cursor c=db.rawQuery("SELECT * FROM feedback1", null);
		    		if(c.getCount()==0)
		    		{
		    			showMessage("Error", "No Records Found");
		    			return;
		    		}
		    		StringBuffer buffer=new StringBuffer();
		    		while(c.moveToNext())
		    		{
		    			buffer.append("Name: "+c.getString(0)+"\n");
		    			buffer.append("Email: "+c.getString(1)+"\n");
		    			buffer.append("Rating:"+c.getString(2)+"\n");
		    			buffer.append("Comment: "+c.getString(3)+"\n");
		    			buffer.append("Email Response:"+c.getString(4)+"\n\n");
		    		}
		    		showMessage("Feedback Details", buffer.toString());
		    	}
		 }
		    public void showMessage(String title,String message)
		    {
		    	Builder builder=new Builder(this);
		    	builder.setCancelable(true);
		    	builder.setTitle(title);
		    	builder.setMessage(message);
		    	builder.show();
			}
		    public void clearText()
		    {
		    	eName.setText("");
		    	eEmail.setText("");
		    	tv.setText("0.0");
		    	eCom.setText("");
		    	chk.setChecked(false);
		    	eName.requestFocus();
		    }
	}
