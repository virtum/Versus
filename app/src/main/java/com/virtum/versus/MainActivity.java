package com.virtum.versus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreate(View view) {
        Intent intent = new Intent(this, CreateTopicActivity.class);
        startActivity(intent);
    }

    public void onClickTopics(View view) {
        Intent intent = new Intent(this, TopicsActivity.class);
        startActivity(intent);
    }
}
