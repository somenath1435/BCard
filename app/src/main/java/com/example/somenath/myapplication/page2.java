package com.example.somenath.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class page2 extends AppCompatActivity
{
    Button b1,b2;
    EditText from,to;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        b1=(Button)findViewById(R.id.MakeBirthdayCard);
        b2=(Button)findViewById(R.id.GoBack);
        from=(EditText)findViewById(R.id.editTextFrom);
        to=(EditText)findViewById(R.id.editTextTo);
    }

    public void GoBack(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void card(View v)
    {
        Intent i=new Intent(this,page3.class);
        String f =from.getText().toString();
        String t=to.getText().toString();
        i.putExtra("from",f);
        i.putExtra("to",t);
        startActivity(i);
    }
}

