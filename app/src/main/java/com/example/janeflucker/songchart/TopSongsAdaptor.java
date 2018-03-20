package com.example.janeflucker.songchart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janeflucker on 3/20/18.
 */

public class TopSongsAdaptor extends ArrayAdapter<Song> {
    public TopSongsAdaptor(Context context, ArrayList<Song> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Song currentSong = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_song_item, parent, false);
        }

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRanking().toString());

        TextView album = listItemView.findViewById(R.id.album);
        album.setText(currentSong.getAlbum());

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        listItemView.setTag(currentSong);

        return listItemView;
    }

}
