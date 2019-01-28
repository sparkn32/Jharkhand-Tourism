package com.example.jharkhand.tourism;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class List2 extends Activity {
    ListView simpleList;
    ArrayList<Item> placeList=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);
        simpleList = (ListView) findViewById(R.id.listView1);
        placeList.add(new Item("Temples",R.drawable.jagan2));
        placeList.add(new Item("Dam & Falls",R.drawable.maithon1));
        placeList.add(new Item("Park",R.drawable.jubilee2));
        placeList.add(new Item("Hill Station",R.drawable.shikharji2));
        placeList.add(new Item("Wildlife & Sanctuary",R.drawable.betla4));
        placeList.add(new Item("Fort",R.drawable.palamau2));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,placeList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	@Override
        	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent i;
		switch (arg2) {
		case 0:
			i=new Intent(List2.this,Gallery1.class);
			startActivity(i);
			break;
		case 1:
			i=new Intent(List2.this,Gallery2.class);
			startActivity(i);
			break;
		case 2:
			i=new Intent(List2.this,Gallery3.class);
			startActivity(i);
			break;
		case 3:
			i=new Intent(List2.this,Gallery4.class);
			startActivity(i);
			break;
		case 4:
			i=new Intent(List2.this,Gallery5.class);
			startActivity(i);
			break;
		case 5:
			i=new Intent(List2.this,Gallery6.class);
			startActivity(i);
			break;

		default:
			break;
		}
		}
		});
    }
}
