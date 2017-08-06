package com.virtum.versus;

import android.app.Activity;
import android.os.Bundle;
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
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                titles);

        lv.setAdapter(arrayAdapter);
    }
}
