package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MessageFabActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    EditText title,desc;
    Spinner spinner;
    Button send;
    ImageView bookingback;
    String[] type = { "David", "Jake","Michael", "Stanley", "Frankie", "Elliot"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msg_fab_action);

        title = (EditText)findViewById(R.id.title);
        desc = (EditText)findViewById(R.id.desc);
        send = (Button)findViewById(R.id.send);
        spinner = (Spinner)findViewById(R.id.selectcoach);
        bookingback = (ImageView) findViewById(R.id.bookingback);

        send.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,type);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);


        bookingback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

       send.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String t = title.getText().toString().trim();
               String d = desc.getText().toString().trim();

               if (t.equals("")){
                   title.setError("Title Required");
               }else if (d.equals("")){
                   desc.setError("Description Required");
               }else {
                   startActivity(new Intent(MessageFabActivity.this, MainActivity.class));
                   Toast.makeText(MessageFabActivity.this,"Your message send succesfully",Toast.LENGTH_LONG).show();

               }

           }
       });


    }

    @Override
    public void onClick(View view) {


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
