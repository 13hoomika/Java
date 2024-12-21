package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.songs.Songs;

public class Spotify {
    Songs songs;
    public boolean addSongs(Songs songs){
        boolean isAdded = false;
        if (songs != null){
            if(songs.getSongId() > 0 && songs.getSinger() != null){
                this.songs = songs;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public void getDetails(){
        System.out.println("Spotify Song ID: " + songs.getSongId());
        System.out.println("Singers: " + songs.getSinger());
        System.out.println("Song: " + songs.getSongName());
        System.out.println("Composed By: " + songs.getComposedBy());
        System.out.println("Written By: " + songs.getWrittenBy());
        System.out.println("Produced By: " + songs.getProducedBy());
    }
}
