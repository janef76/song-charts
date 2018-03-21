package com.example.janeflucker.songchart;

import java.io.Serializable;

/**
 * Created by janeflucker on 3/20/18.
 */

public class Song implements Serializable {

    private Integer ranking;
    private String artist;
    private String album;

    public Song(Integer ranking, String artist, String album) {
        this.ranking = ranking;
        this.artist = artist;
        this.album = album;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
