package com.stephenknutter.notetoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Note mTempNote = new Note();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.action_add > 0) {
            DialogNewNote dialog = new DialogNewNote();
            dialog.show(getFragmentManager(), "");
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogShowNote dialog = new DialogShowNote();
                dialog.sendNoteSelected(mTempNote);
                dialog.show(getFragmentManager(), "123");
            }
        });
    }

    public void createNewNote(Note n) {
        mTempNote = n;
    }
}
