package demo.javahelps.com.depofcse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        pdfView= findViewById(R.id.pdf1);
        pdfView.fromAsset("pdf1.pdf").load();
    }
}
