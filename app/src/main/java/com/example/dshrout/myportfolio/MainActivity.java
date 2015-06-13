package com.example.dshrout.myportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Private Methods
    private void displayToastMessage(String msg, int duration) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    // Public Methods
    public void launchMediaStreamer(View v) {
        displayToastMessage("Get ready to rock and roll!", Toast.LENGTH_LONG);
    }

    public void launchScores(View v) {
        displayToastMessage("42", Toast.LENGTH_LONG);
    }

    public void launchLibrary(View v) {
        displayToastMessage("dat Book!", Toast.LENGTH_LONG);
    }

    public void launchBIB(View v) {
        displayToastMessage("We're gonna need Bob...", Toast.LENGTH_LONG);
    }

    public void launchBacon(View v) {
        displayToastMessage("I don't read it, I eat it!", Toast.LENGTH_LONG);
    }

    public void launchCapstone(View v) {
        displayToastMessage("yeah, toast!", Toast.LENGTH_LONG);
    }
}
