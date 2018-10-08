package com.example.somenath.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class page3 extends AppCompatActivity
{
    TextView from,to;
    String f1,t1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        from=(TextView)findViewById(R.id.from);
        to=(TextView)findViewById(R.id.to);
        f1=getIntent().getExtras().getString("from");
        from.setText(f1);
        t1=getIntent().getExtras().getString("to");
        to.setText(t1);
    }
}
