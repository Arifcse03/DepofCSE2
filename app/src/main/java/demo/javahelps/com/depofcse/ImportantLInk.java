package demo.javahelps.com.depofcse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ImportantLInk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_link);

        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());



        TextView tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setMovementMethod(LinkMovementMethod.getInstance());



        TextView tv6 = (TextView) findViewById(R.id.tv6);
        tv6.setMovementMethod(LinkMovementMethod.getInstance());


        TextView tv8 = (TextView) findViewById(R.id.tv8);
        tv8.setMovementMethod(LinkMovementMethod.getInstance());




    }
}
