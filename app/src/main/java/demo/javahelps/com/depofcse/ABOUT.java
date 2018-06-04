package demo.javahelps.com.depofcse;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ABOUT extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        t=findViewById(R.id.textabout);
       Typeface my = Typeface.createFromAsset(getAssets(),"RockBiterOutlines.ttf");
   t.setTypeface(my);
    }
}
