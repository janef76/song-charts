package com.example.janeflucker.songchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}



//public void onListItemClick(View listItem) {
//        Movie selectedMovie = (Movie) listItem.getTag();
//
//        Log.d("MainActivity", selectedMovie.getTitle());
//
//        Intent intent = new Intent(this, MovieActivity.class);
//        intent.putExtra("movie", selectedMovie);
//
//        startActivity(intent);
//        }