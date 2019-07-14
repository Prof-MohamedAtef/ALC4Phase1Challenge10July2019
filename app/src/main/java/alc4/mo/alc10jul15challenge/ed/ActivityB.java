package alc4.mo.alc10jul15challenge.ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.*;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityB extends AppCompatActivity{


    @BindView(R.id.webview)
    WebView mWebView;

    @BindView(R.id.toolbar_aboutalc)
    Toolbar toolbar;

    private String andelaurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalcb);
        setTheme(R.style.ArishTheme);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.arr_back_left));
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     onBackPressed();
                                                     finish();
                                                 }
                                             });
        Intent intent = getIntent();
        andelaurl = intent.getExtras().getString(MainActivity.URL_KEY);

        WebSettings Settings= mWebView.getSettings();
        Settings.setJavaScriptEnabled(true);
        Settings.setDomStorageEnabled(true);

        mWebView.setWebViewClient(new MyWebViewClient());

        mWebView.loadUrl(andelaurl);
    }
}