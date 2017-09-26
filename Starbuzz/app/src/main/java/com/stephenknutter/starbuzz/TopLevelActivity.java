package com.stephenknutter.starbuzz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        // Set ListView Click Listener
        AdapterView.OnItemClickListener itemClickListener =
        new AdapterView.OnItemClickListener() {
          public void onItemClick(AdapterView<?> listView,
                                  View v,
                                  int position,
                                  long id)  {
              if (position == 0) {
                  Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                  startActivity(intent);
              }
          }
        };

        // Add Click Listener to view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
