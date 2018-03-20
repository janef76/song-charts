package com.example.janeflucker.songchart;

import java.util.ArrayList;

/**
 * Created by janeflucker on 3/20/18.
 */

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "MOTION PICTURE CAST RECORDING", "THE GREATEST SHOWMAN"));
        list.add(new Song(2, "DIVIDE", "ED SHEERAN"));
        list.add(new Song(3, "A REAL LABOUR OF LOVE", "UB40 FT ALI/ASTRO/MICKEY"));
        list.add(new Song(4, "ONLY HUMAN", "CALUM SCOTT"));
        list.add(new Song(5, "FIREPOWER", "JUDAS PRIEST"));
        list.add(new Song(6, "VIOLENCE", "EDITORS"));
        list.add(new Song(7, "DUA LIPA", "DUA LIPA"));
        list.add(new Song(8, "BOTH SIDES OF THE SKY", "JIMI HENDRIX"));
        list.add(new Song(9, "THE THRILL OF IT ALL", "SAM SMITH"));
        list.add(new Song(10, "HUMAN", "RAG'N'BONE MAN"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}
