package alc4.mo.alc10jul15challenge.ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    static String URL_KEY="URL_KEY";

    @BindView(R.id.btn_about_alc)
    Button btn_about_alc;

    @BindView(R.id.btn_my_profile)
    Button btn_Profile;

    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.ArishTheme);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        btn_about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent=new Intent(MainActivity.this, ActivityB.class);
                aboutIntent.putExtra(URL_KEY, getString(R.string.alc_about_url));
                startActivity(aboutIntent);
            }
        });

        btn_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent=new Intent(MainActivity.this, ActivityC.class);
                startActivity(aboutIntent);
            }
        });
    }
}
