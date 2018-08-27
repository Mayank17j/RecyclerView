package com.example.lenovo.recyclerview;

import android.content.ContentResolver;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[],data2[];
    int img[];
    Context ctx;

    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[]){
        ctx=ct;
        data1=s1;
        data2=s2;
        img=i1;

    }
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //here the need of hml file to each row by using inflater
        //Inflater class are capable to inflate xml file to java file
        LayoutInflater myinf=LayoutInflater.from(ctx);
        //WHAT TO INFLATE ,ViewGroup ,noWantToAttach
        View myOwnView=myinf.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
         holder.t1.setText(data1[position]);
         holder.t2.setText(data2[position]);
         holder.myImage.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView myImage;
        public MyOwnHolder(View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.textView1);
            t2=(TextView)itemView.findViewById(R.id.textView2);
            myImage=(ImageView)itemView.findViewById(R.id.imageView1);
        }
    }
}
