package com.virtum.versus;

import android.app.Activity;
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
    }

    public void onClickTopics(View view) {
        final TextView testView = findViewById(R.id.test_view);
        testView.setText("Topics!");
    }
}
