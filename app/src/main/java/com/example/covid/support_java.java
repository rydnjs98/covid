package com.example.covid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class support_java extends AppCompatActivity {

    Button btn4;
    Button btn5;
    Button btn6;

    WebView webview1;
    //private String url = "https://covid19m.kdca.go.kr/KP/epq/35700092A";

    @Override
    protected void onCreate(@Nullable Bundle savedIntenceStae) {
        super.onCreate(savedIntenceStae);
        setContentView(R.layout.support);

        btn4 = findViewById(R.id.imageView4);
        btn5 = findViewById(R.id.imageView5);
        btn6 = findViewById(R.id.covid_document);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.iksan.go.kr/index.iksan?menuCd=DOM_000002018001002000"));
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ncvr.kdca.go.kr/cobk/index.html"));
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview1 = (WebView)findViewById(R.id.webview1);
                //webview1.loadUrl(url);

                WebSettings webSettings = webview1.getSettings();
                webSettings.setJavaScriptEnabled(true);

                getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_USER);

                //webview1.setWebChromeClient(new WebChromeClient());


                webview1.setWebViewClient(new WebViewClient());
                webview1.loadUrl("https://covid19m.kdca.go.kr/KP/epq/35700092A");

                ActionBar actionBar=getSupportActionBar();
                actionBar.hide();

                btn4.setVisibility(View.GONE);
                btn5.setVisibility(View.GONE);
                btn6.setVisibility(View.GONE);
                //여기가 api 적용전 파일
                //11-1 수정

            }
        });
    }


}