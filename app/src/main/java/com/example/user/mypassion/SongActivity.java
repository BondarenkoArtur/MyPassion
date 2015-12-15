package com.example.user.mypassion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class SongActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private SongAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        mListView = (ListView) findViewById(R.id.song_list);
        mAdapter = new SongAdapter(this, new ArrayList<Song>());
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
        updateData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_song, menu);
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
        if (id == R.id.action_addSong) {
            Intent intent = new Intent(SongActivity.this, com.example.user.mypassion.SongCreateActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void updateData(){
        ParseQuery<Song> query = ParseQuery.getQuery(Song.class);
        query.setCachePolicy(ParseQuery.CachePolicy.CACHE_THEN_NETWORK);
        query.findInBackground(new FindCallback<Song>() {

            @Override
            public void done(List<Song> songs, ParseException error) {
                if (songs != null) {
                    mAdapter.clear();
                    mAdapter.addAll(songs);
                }
            }
        });
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Song song = mAdapter.getItem(position);
        Intent intent = new Intent(SongActivity.this, com.example.user.mypassion.LyricsActivity.class);
        intent.putExtra("name", song.getName());
        intent.putExtra("lyrics", song.getLyrics());
        startActivity(intent);
    }
}
