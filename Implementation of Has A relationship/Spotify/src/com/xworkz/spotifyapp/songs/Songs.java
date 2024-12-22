package com.xworkz.spotifyapp.songs;

public class Songs {
    private int songId;
    private String songName;
    private String singer;
    private String writtenBy;
    private String producedBy;
    private String composedBy;

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setComposedBy(String composedBy) {
        this.composedBy = composedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public int getSongId() {
        return songId;
    }

    public String getComposedBy() {
        return composedBy;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getSinger() {
        return singer;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public String getSongName() {
        return songName;
    }
}

