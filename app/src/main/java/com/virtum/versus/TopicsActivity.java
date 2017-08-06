package com.virtum.versus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopicsActivity extends Activity {

    public static List<String> titles = new ArrayList<>();
    public static HashMap<String, TopicModel> topics = new HashMap<>();

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);


        lv = findViewById(R.id.list_options);
        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                Intent intent = new Intent(TopicsActivity.this,
                        TopicDetailsActivity.class);
                intent.putExtra("newTopic", topics.get(titles.get(position)));
                startActivity(intent);
            }
        });

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                titles);

        lv.setAdapter(arrayAdapter);


    }
}
