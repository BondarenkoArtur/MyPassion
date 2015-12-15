package com.example.user.mypassion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {
    private final Context mContext;
    private final List<Song> mSongs;

    public SongAdapter(Context context, List<Song> objects) {
        super(context, R.layout.song_row_item, objects);
        this.mContext = context;
        this.mSongs = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
            convertView = mLayoutInflater.inflate(R.layout.song_row_item, null);
        }

        Song song = mSongs.get(position);

        TextView nameView = (TextView) convertView.findViewById(R.id.song_name);

        nameView.setText(song.getName());

        return convertView;
    }
}
