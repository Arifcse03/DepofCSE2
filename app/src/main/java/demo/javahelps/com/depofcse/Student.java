package demo.javahelps.com.depofcse;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
}
    public void seca (View v){

        startActivity(new Intent(Student.this,SECA.class));

    }

    public void secb (View v){

        startActivity(new Intent(Student.this,SECB.class));

    }

}
