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
        final TextView testView = findViewById(R.id.test_view);
        testView.setText("Create!");

        String messageText = testView.getText().toString();
        Intent intent = new Intent(this, CreateTopicActivity.class);
        intent.putExtra(CreateTopicActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }

    public void onClickTopics(View view) {
        final TextView testView = findViewById(R.id.test_view);
        testView.setText("Topics!");

        String messageText = testView.getText().toString();
        Intent intent = new Intent(this, TopicsActivity.class);
        intent.putExtra(TopicsActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}
