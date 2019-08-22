package com.example.aji.aplikasi_muslim_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivityDoa extends AppCompatActivity {

    private String[] doa = {"Doa Niat Berwudhu","Doa Setelah Berwudhu","Doa Untuk Kedua orang Tua","Doa sebelum tidur", "Doa bangun tidur", "Doa ketika masuk rumah"
    , "Doa ketika bercermin", "Hadist menuntut ilmu"};
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getName = data.get(position);

                Intent sendData = new Intent(MainActivityDoa.this, DataDoa.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData() {
        Collections.addAll (data, doa);
    }
}
