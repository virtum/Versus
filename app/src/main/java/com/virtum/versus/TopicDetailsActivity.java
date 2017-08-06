package com.virtum.versus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TopicDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_details);

        Intent intent = getIntent();
        TopicModel newTopic = (TopicModel) intent.getSerializableExtra("newTopic");

        final TextView title = findViewById(R.id.title_view);
        title.setText(newTopic.getTitle());

        final TextView description = findViewById(R.id.description_view);
        description.setText(newTopic.getDescription());
    }
}
