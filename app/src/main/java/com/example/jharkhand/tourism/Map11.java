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

public class Map11 extends Activity {
	WebView wv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        wv=(WebView)findViewById(R.id.webView1);
        wv.loadUrl("https://www.google.co.in/maps/place/Khandoli+Dam,+Partappur+Kalichatan,+Jharkhand+815312/@24.233567,86.3369352,15z/data=!4m5!3m4!1s0x39f1512e64cac355:0xf8c6c84b15428ce0!8m2!3d24.2334403!4d86.3433399");
        WebSettings ws=wv.getSettings();
        ws.setDefaultZoom(ZoomDensity.FAR);
        ws.setBuiltInZoomControls(true);
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyView());
    }
class MyView extends WebViewClient
{
ProgressDialog pd=new ProgressDialog(Map11.this);
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
