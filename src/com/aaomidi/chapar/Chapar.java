package com.aaomidi.chapar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import com.example.BodoChat.R;

public class Chapar extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //this.getMenuInflater().inflate(R);
        return true;
    }
}
