package com.institute.spotify.songs;

import com.institute.spotify.constants.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Songs {
    private int id;
    private String title;
    private String artist;
    private Category genre;
    private int releaseYear;
}
