package com.example.jharkhand.tourism;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Map20 extends Activity {
	WebView wv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        wv=(WebView)findViewById(R.id.webView1);
        wv.loadUrl("https://www.google.co.in/maps/place/Tata+Steel+Zoological+Park/@22.8139621,86.1949644,17z/data=!4m5!3m4!1s0x39f5e39f85c447b3:0xaa1b7d3fd4073e9b!8m2!3d22.814595!4d86.19593");
        WebSettings ws=wv.getSettings();
        ws.setDefaultZoom(ZoomDensity.FAR);
        ws.setBuiltInZoomControls(true);
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyView());
    }
class MyView extends WebViewClient
{
ProgressDialog pd=new ProgressDialog(Map20.this);
	@Override
	public void onPageFinished(WebView view, String url) {
		// TODO Auto-generated method stub
		pd.dismiss();
		super.onPageFinished(view, url);
	}

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		// TODO Auto-generated method stub
		pd.setTitle("Loading.....");
		pd.setMessage("Page is being loaded");
		pd.show();
		super.onPageStarted(view, url, favicon);
	}

	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		// TODO Auto-generated method stub
		view.loadUrl(url);
		return super.shouldOverrideUrlLoading(view, url);
	}
	
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
