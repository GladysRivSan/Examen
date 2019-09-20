package com.example.actividad4_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class ClaseListViewActivity extends AppCompatActivity {

    GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_list_view);
        listView = findViewById(R.id.listView);
        final ClaseAdapter adapter = new ClaseAdapter(ListaDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(i).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}
