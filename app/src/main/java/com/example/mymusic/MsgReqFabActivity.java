package com.example.mymusic;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MsgReqFabActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    EditText title,desc,dateET;
    Spinner spinner;
    Button send;
    ImageView bookingback;
    String[] type = { "David", "Jake","Michael", "Stanley", "Frankie", "Elliot"};
    Calendar myCalendar = Calendar.getInstance();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msg_req_fab_action);

        title = (EditText)findViewById(R.id.title);
        desc = (EditText)findViewById(R.id.desc);
        dateET = (EditText)findViewById(R.id.date);
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
               String dt = dateET.getText().toString().trim();

               if (t.equals("")){
                   title.setError("Title Required");
               }else if (d.equals("")){
                   desc.setError("Description Required");
               }else if (dt.equals("")){
                   dateET.setError("Date Required");
               }else {
                   startActivity(new Intent(MsgReqFabActivity.this, MainActivity.class));
                   Toast.makeText(MsgReqFabActivity.this,"Your message request send succesfully",Toast.LENGTH_LONG).show();

               }

           }
       });


    //    EditText edittext= (EditText) findViewById(R.id.Birthday);
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        dateET.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(MsgReqFabActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


    }

    private void updateLabel() {
        String myFormat = "dd/MM/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        dateET.setText(sdf.format(myCalendar.getTime()));
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
