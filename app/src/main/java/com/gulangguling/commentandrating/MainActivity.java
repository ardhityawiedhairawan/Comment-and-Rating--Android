package com.gulangguling.commentandrating;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private  Button btnSend;
    private EditText content;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnBtnComment();
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        content = (EditText) findViewById(R.id.content);
        result = (TextView) findViewById(R.id.result);
    }
    public void addListenerOnBtnComment(){
        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("rating",String.valueOf(ratingBar.getRating()));
                Log.d("isi komentar", String.valueOf(content.getText()));
                result.setText("Rating : "+ String.valueOf(ratingBar.getRating())+"\nComment: " +String.valueOf(content.getText()));

            }
        });
    }
}

/* Author   : Ardhitya Wiedha Irawan
*  Website  : http://aiueo.web.id
*  github   : ardhityawiedhairawan
*  twitter  : papap_aila
*
* */