package com.example.janeflucker.songchart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janeflucker on 3/20/18.
 */

public class SongTest {
    Song song;

    @Before
    public void before() {
        song = new Song(1, "MOTION PICTURE CAST RECORDING", "THE GREATEST SHOWMAN");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, song.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("MOTION PICTURE CAST RECORDING", song.getArtist());

    }

    @Test
    public void getYearTest() {
        assertEquals("THE GREATEST SHOWMAN", song.getAlbum());

    }
}
