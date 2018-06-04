package demo.javahelps.com.depofcse;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class home extends AppCompatActivity {
private static int SPLASE_TIME_ONUT=3000;

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t=findViewById(R.id.home1);
        Typeface my = Typeface.createFromAsset(getAssets(),"RockBiterOutlines.ttf");
        t.setTypeface(my);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(home.this,Menu.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASE_TIME_ONUT
        );


    }
}
