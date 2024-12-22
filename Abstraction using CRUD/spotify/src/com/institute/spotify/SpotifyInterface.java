package com.institute.spotify;

import com.institute.spotify.constants.Category;
import com.institute.spotify.songs.Songs;

public interface SpotifyInterface {
    public boolean addTracks(Songs songs);
    public void getTracks();
    public Songs getTitleById(int id);
    public Songs getArtistByTitle(String title);
    public Songs getGenreByTitle(String title);
    public Songs getReleaseYearByArtist(String artist);
    public Songs getTitleByGenre(Category genre);
    public boolean updateTitleById(int id,String updatedTitle);
    public boolean updateReleaseYearByTitle(String title,int updatedReleaseYear);
    public boolean deleteTrackById(int id);

}
