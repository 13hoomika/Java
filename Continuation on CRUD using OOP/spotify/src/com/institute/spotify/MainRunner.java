package com.institute.spotify;

import com.institute.spotify.songs.Songs;
import com.institute.spotify.constants.Category;
import com.institute.spotify.musicplayer.MusicPlayer;

public class MainRunner {
    public static void main(String[] args) {
        Songs track1 =new Songs();
        track1.setId(1);
        track1.setTitle("Nothing Feels Better");
        track1.setArtist("Pink Sweat$");
        track1.setGenre(Category.RnB);
        track1.setReleaseYear(2022);

        Songs track2 =new Songs();
        track2.setId(2);
        track2.setTitle("What A Wonderful World");
        track2.setArtist("Louis Armstrong");
        track2.setGenre(Category.JAZZ);
        track2.setReleaseYear(1967);

        Songs track3 =new Songs();
        track3.setId(3);
        track3.setTitle("Birds of a Feather");
        track3.setArtist("Billie Eilish");
        track3.setGenre(Category.INDIE);
        track3.setReleaseYear(2024);

        Songs track4 =new Songs();
        track4.setId(4);
        track4.setTitle("Chor");
        track4.setArtist("Justh");
        track4.setGenre(Category.CHILL);
        track4.setReleaseYear(2024);

        Songs track5 =new Songs();
        track5.setId(5);
        track5.setTitle("Chanakya");
        track5.setArtist("Rishab Rikhiram Sharma");
        track5.setGenre(Category.CLASSICAL);
        track5.setReleaseYear(2022);


        MusicPlayer musicPlayer =new MusicPlayer();
        musicPlayer.addTracks(track1);
        musicPlayer.addTracks(track2);
        musicPlayer.addTracks(track3);
        musicPlayer.addTracks(track4);
        musicPlayer.addTracks(track5);

       musicPlayer.getTracks();

        musicPlayer.getTitleById(3);

        musicPlayer.getArtistByTitle("Chanakya");

        musicPlayer.getGenreByTitle("Nothing Feels Better");

        musicPlayer.getReleaseYearByArtist("Pink Sweat$");

        musicPlayer.getTitleByGenre(Category.RnB);

        musicPlayer.updateTitleById(1,"Nothing Feels Better - Pink Sweat$");

        musicPlayer.updateReleaseYearByTitle("Nothing Feels Better",2022);

        musicPlayer.deleteTrackById(4);

        musicPlayer.getTracks();
    }
}
