package com.example.janeflucker.songchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdaptor songsAdaptor = new TopSongsAdaptor(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdaptor);
    }


    public void onListItemClick(View listItem) {
        Song selectedSong = (Song) listItem.getTag();

        Log.d("MainActivity", selectedSong.getArtist());

        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("song", selectedSong);

        startActivity(intent);
    }
}