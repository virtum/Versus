package com.virtum.versus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateTopicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_topic);
    }

    public void onClickCreateTopic(View view) {
        final EditText titleText = findViewById(R.id.title);
        final EditText descriptionView = findViewById(R.id.description);

        String title = titleText.getText().toString();
        String description = descriptionView.getText().toString();
        TopicModel newTopic = new TopicModel(title, description);

        TopicsActivity.titles.add(title);
        TopicsActivity.topics.put(title, newTopic);

        Intent intent = new Intent(this, TopicDetailsActivity.class);
        intent.putExtra("newTopic", newTopic);
        startActivity(intent);
    }
}
