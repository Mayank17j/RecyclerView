package com.example.lenovo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    String s1[],s2[];
    int imageRes[]={R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog};
    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.myRecyclerView);
        s1=getResources().getStringArray(R.array.pet_name);
        s2=getResources().getStringArray(R.array.Description);

        ad=new MyOwnAdapter(this,s1,s2,imageRes);

        rv.setAdapter(ad);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}
