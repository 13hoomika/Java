package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songs.Songs;
import com.xworkz.spotifyapp.spotify.Spotify;

public class Runner {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();

        Songs song = new Songs();
        song.setSongId(1);
        song.setSongName("Mayavi");
        song.setSinger("Sonu Nigam,Sanjith Hegde");
        song.setProducedBy("Gautham Hebbar, Sunny M.R, Sanjith Hegde");

        Songs song1 = new Songs();
        song1.setSongId(1);
        song1.setSongName("Mayavi");
        song1.setSinger("Sonu Nigam,Sanjith Hegde");
        song1.setProducedBy("Gautham Hebbar, Sunny M.R, Sanjith Hegde");

//        spotify.addSongs(song);
//        spotify.getDetails();

        System.out.println(song);
        System.out.println(song1);

        System.out.println(song.hashCode());
        System.out.println(song1.hashCode());

        boolean isSame = song.equals(song1);
        System.out.println(isSame);
    }
}
