package com.example.s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SearchView searchView;
    private ArrayAdapter adapter;
    private ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {



            listView=findViewById(R.id.list);
            searchView=findViewById(R.id.search);
            arrayList=new ArrayList();

            arrayList.add("shyam");
            arrayList.add("neetu");
            arrayList.add("yamu");
            arrayList.add("ramya");
            arrayList.add("sailu");
            arrayList.add("swetha");
            arrayList.add("mom");
            arrayList.add("yamini");
            arrayList.add("sirisha");
            arrayList.add("shiny");

            adapter=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList);
            listView.setAdapter(adapter);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    adapter.getFilter().filter(s);
                    return false;
                }
            });
        }





        }
    }
