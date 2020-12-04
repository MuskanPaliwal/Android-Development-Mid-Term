package com.example.androiddevelopmentmidterm;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listview;
    String name, age, gender;
    ArrayList<lvitem>arrayList = new ArrayList<>();
    FloatingActionButton mAddFab;
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=(ListView)findViewById(R.id.lv);
        mAddFab = findViewById(R.id.add_fab);
        mAddFab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.fabitem);
                EditText etname = dialog.findViewById(R.id.etname);
                EditText etage = dialog.findViewById(R.id.etage);
                EditText etgender = dialog.findViewById(R.id.etgender);
                Button btnsave = dialog.findViewById(R.id.btnsave);



                btnsave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name = etname.getText().toString();
                        age = etage.getText().toString();
                        gender = etgender.getText().toString();

                        lvitem lvitem = new lvitem();
                        lvitem.setName(name);
                        lvitem.setAge(age);
                        lvitem.setGender(gender);
                        arrayList.add(lvitem);
                        dialog.dismiss();

                        ContectAdapter contectAdapter = new ContectAdapter(arrayList, MainActivity.this);
                        listview.setAdapter(contectAdapter);
                    }
                });

                dialog.show();

            }
        });

    }
}