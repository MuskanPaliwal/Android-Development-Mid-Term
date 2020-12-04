package com.example.androiddevelopmentmidterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContectAdapter extends BaseAdapter {
    ArrayList<lvitem>arrayList;
    Context context;
    LayoutInflater layoutInflater;

    public ContectAdapter(ArrayList<lvitem> arrayList, Context context){
        this.arrayList = arrayList;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.lvitem, viewGroup, false);
        TextView txtname = view1.findViewById(R.id.txtname);
        TextView txtage = view1.findViewById(R.id.txtage);
        TextView txtgender = view1.findViewById(R.id.txtgender);
        txtname.setText(arrayList.get(i).getName());
        txtage.setText(arrayList.get(i).getAge());
        txtgender.setText(arrayList.get(i).getGender());
        
        return view1;
    }
}
