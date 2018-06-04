package demo.javahelps.com.depofcse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void student(View v){

        startActivity(new Intent(Menu.this,Student.class));
    }

    public void about(View v){

        startActivity(new Intent(Menu.this,ABOUT.class));
    }


    public void teacher(View v){

        startActivity(new Intent(Menu.this,Teachers.class));
    }
    public void pdf(View v){

        startActivity(new Intent(Menu.this,Syllabus.class));
    }


    public void important(View v){

        startActivity(new Intent(Menu.this,ImportantLInk.class));
    }
    public void attendance(View v){

        startActivity(new Intent(Menu.this,Attendance.class));
    }




}
