package com.mkoffeine.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mkoffeine.testapp.model.Person;
import com.mkoffeine.testapp.model.PersonHolder;
import com.mkoffeine.testapp.model.Utils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private List<Person> persons = PersonHolder.getInstance().getPersonList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Utils.getInfoFromPersonList(persons));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });

    }
}
