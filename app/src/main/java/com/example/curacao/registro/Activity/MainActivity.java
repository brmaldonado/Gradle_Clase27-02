package com.example.curacao.registro.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.curacao.registro.R;
import com.example.curacao.registro.database.Models.TestModel;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo);


        HtmlTextView htmlview = findViewById(R.id.htmlText);

        TestModel t1 = new TestModel();
        t1.name = "Pedrito";
        t1.last_name = "Carmelito";
        t1.save();


        htmlview.setHtml("<h2>Hello wold</h2><img src=\"http://www.example.com/cat_pic.png\"/>",
                new HtmlHttpImageGetter(htmlview));

    }
}
