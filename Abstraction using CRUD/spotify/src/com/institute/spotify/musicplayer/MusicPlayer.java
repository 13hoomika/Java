package com.institute.spotify.musicplayer;


import com.institute.spotify.SpotifyInterface;
import com.institute.spotify.constants.Category;
import com.institute.spotify.songs.Songs;

import java.util.Arrays;

public class MusicPlayer implements SpotifyInterface {
    Songs songs[]=new Songs[5];
    int index;

    @Override
    public boolean addTracks(Songs songs) {
        if (index < this.songs.length) {
            if (songs.getId() > 0 && songs.getTitle() != null && songs.getGenre() != null) {
                this.songs[index++] = songs;
                System.out.println("Track Added Successfully");
                return true;
            } else {
                System.out.println("Invalid details");
                return false;
            }
        } else {
            System.out.println("Max Track reached");
            return false;
        }
    }
    @Override
    public void getTracks(){
        System.out.println("---------- Songs Details ---------- ");
        for (Songs track:songs){
            if (track != null){
                System.out.println("Song Id: "+track.getId());
                System.out.println("Song Title: "+track.getTitle());
                System.out.println("Song Artist: "+track.getArtist());
                System.out.println("Genre: "+track.getGenre());
                System.out.println("Song ReleaseYear: "+track.getReleaseYear());
                System.out.println("_________________________________________________");
            }else {
                System.out.println("Not Available");
            }
        }
    }

    @Override
    public Songs getTitleById(int id){
        Songs isTitleFoundById=null;
        System.out.println("Get Title By Id");
        for (Songs track:  songs){
            if (track != null && track.getId()==id){
                isTitleFoundById=track;
                System.out.println("SongId: "+ track.getId());
                System.out.println("SongTitle: "+ track.getTitle());
                System.out.println("________________________________________________");
            }
        }
        if (isTitleFoundById == null){
            System.out.println("Title not found");
        }
        return isTitleFoundById;
    }

    @Override
    public Songs getArtistByTitle(String title){
        Songs isArtistFoundByTitle=null;
        System.out.println("Get Artist By Title");
        for (Songs track:songs){
            if (track != null && track.getTitle()==title){
                isArtistFoundByTitle = track;
                System.out.println("SongTitle: "+ track.getTitle());
                System.out.println("SongArtist: "+ track.getArtist());
                System.out.println("__________________________________________");
            }
        }
        if (isArtistFoundByTitle==null){
            System.out.println("Artist not found");
        }
        return isArtistFoundByTitle;
    }

    @Override
    public Songs getGenreByTitle(String title){
        Songs isGenreFoundByTitle=null;
        System.out.println("GetGenre By Title");
        for (Songs track:songs){
            if (track != null && track.getTitle()==title){
                isGenreFoundByTitle = track;
                System.out.println("SongTitle: "+ track.getTitle());
                System.out.println("Genre: "+ track.getGenre());
                System.out.println("______________________________________________");
            }
        }
        if (isGenreFoundByTitle==null){
            System.out.println("Genre not found");
        }
        return isGenreFoundByTitle;
    }

    @Override
    public Songs getReleaseYearByArtist(String artist){
        Songs isReleaseYearByArtist=null;
        System.out.println("Get Release Year By Artist");
        for (Songs track:songs){
            if (track != null && track.getArtist()==artist){
                isReleaseYearByArtist= track;
                System.out.println("Artist: "+track.getArtist());
                System.out.println("Song ReleaseYear: "+track.getReleaseYear());
                System.out.println("_______________________________________________");
            }
        }
        if (isReleaseYearByArtist==null){
            System.out.println("ReleaseYear not found");
        }
        return isReleaseYearByArtist;
    }

    @Override
    public Songs getTitleByGenre(Category genre){
        Songs isTitleByGenre=null;
        System.out.println("GetTitle By Genre");
        for (Songs songs1:songs){
            if (songs1.getGenre()== genre){
                isTitleByGenre=songs1;
                System.out.println("Genre: "+songs1.getGenre());
                System.out.println("Title: "+songs1.getTitle());
                System.out.println("_________________________________________________");
            }
        }
        if (isTitleByGenre==null){
            System.out.println("Title not found");
        }
        return isTitleByGenre;
    }

    @Override
    public boolean updateTitleById(int id,String updatedTitle){
        boolean isTitleUpdatedById=false;
        System.out.println("Update Title by Id");
        for (Songs track:songs){
            if (track != null && track.getId()==id){
                track.setTitle(updatedTitle);
                isTitleUpdatedById=true;
                System.out.println("Updated Title");
                System.out.println("_________________________________________________");

            }
        }
        if (isTitleUpdatedById==false){
            System.out.println("Id not Found");
        }
        return isTitleUpdatedById;
    }

    @Override
    public boolean updateReleaseYearByTitle(String title,int updatedReleaseYear){
        boolean isRealeaseYearUpdatedByTitle=false;
        System.out.println("Update Release Year By Title");
        for (Songs songs1:songs){
            if (songs1.getTitle()==title){
                songs1.setReleaseYear(updatedReleaseYear);
                isRealeaseYearUpdatedByTitle=true;
                System.out.println("RealeaseYear updated");
                System.out.println("_________________________________________________");

            }
        }
        if(isRealeaseYearUpdatedByTitle==false){
            System.out.println("Title Not Found");
        }
        return isRealeaseYearUpdatedByTitle;
    }

    @Override
    public boolean deleteTrackById(int id){
        boolean isSongDeleted=false;
        int newIndex=0;
        System.out.println("DeleteSongs By Id");
        for (int start=0;start<this.songs.length;start++){
            Songs track=songs[start];
            if (track.getId() != id){
                songs[newIndex++]=songs[start];
            }else {
                isSongDeleted=true;
                System.out.println("Deleted");
            }
        }
        songs= Arrays.copyOf(songs,newIndex);
        return isSongDeleted;
    }

}
