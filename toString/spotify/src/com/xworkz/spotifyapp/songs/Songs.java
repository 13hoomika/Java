package com.xworkz.spotifyapp.songs;

public class Songs {
    private int songId;
    private String songName;
    private String singer;
    private String producedBy;

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }


    public int getSongId() {
        return songId;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getSinger() {
        return singer;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public String toString() {
        return "Songs(id = " + this.songId + ", " +
                "song name = " + this.songName + "," +
                "singer = " + this.singer + "," +
                "produced by = " + this.producedBy + "," +
                ")";
    }

    @Override
    public int hashCode() {
        return songId;
    }

    @Override
    public boolean equals(Object obj) {
        Songs songs = (Songs) obj;
        if (this.hashCode() == songs.hashCode()) return true;
        return false;
    }
}

