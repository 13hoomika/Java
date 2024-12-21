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
        song.setComposedBy("Sanjith Hegde");
        song.setWrittenBy("Nagarjun Sharma ");
        song.setProducedBy("Gautham Hebbar, Sunny M.R, Sanjith Hegde");

        spotify.addSongs(song);
        spotify.getDetails();
    }
}
