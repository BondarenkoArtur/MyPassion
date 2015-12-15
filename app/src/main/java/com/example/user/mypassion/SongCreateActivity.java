package com.example.user.mypassion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SongCreateActivity extends AppCompatActivity {

    private EditText mNameInput;
    private EditText mLyricsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_create);

        mNameInput = (EditText) findViewById(R.id.name_input);
        mLyricsInput = (EditText) findViewById(R.id.lyrics_input);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_song_create, menu);
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

    public void createTask(View view) {
        if (mNameInput.getText().length() > 0 && mLyricsInput.getText().length() > 0){
            Song song = new Song();
            song.setName(mNameInput.getText().toString());
            song.setLyrics(mLyricsInput.getText().toString());
            song.saveEventually();
            mNameInput.setText("");
            mLyricsInput.setText("");
        }
    }
}
