package com.virtum.versus;

import android.app.Activity;
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
        final EditText title = findViewById(R.id.title);
        final EditText description = findViewById(R.id.title);

        TopicModel newTopic = new TopicModel(title.getText().toString(), description.getText().toString());
    }
}
