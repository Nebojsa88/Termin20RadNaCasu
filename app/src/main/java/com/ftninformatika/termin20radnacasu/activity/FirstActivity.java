package com.ftninformatika.termin20radnacasu.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ftninformatika.termin20radnacasu.R;
import com.ftninformatika.termin20radnacasu.providers.GlumacProvider;

import java.util.List;

public class FirstActivity extends Activity {

    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final List<String> naziviGlumaca = GlumacProvider.getGlumciNames();

        listView1 = findViewById(R.id.list_view);
        ArrayAdapter dataAdapter = new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1, naziviGlumaca);
        ListView listView =  findViewById(R.id.list_view);
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);

            }
        });





    }



}
