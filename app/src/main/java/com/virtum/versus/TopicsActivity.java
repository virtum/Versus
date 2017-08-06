package com.virtum.versus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class TopicsActivity extends Activity {

    public List<String> titles = Arrays.asList("1", "2", "3");

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
