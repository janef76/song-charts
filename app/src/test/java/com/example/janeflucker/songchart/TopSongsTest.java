package com.example.janeflucker.songchart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janeflucker on 3/20/18.
 */

public class TopSongsTest {
    @Test
    public void getListTest() {
        TopSongs topSongs = new TopSongs();
        assertEquals(10, topSongs.getList().size());
    }
}
