package Exercice4;

import java.util.ArrayList;
import java.util.List;

class Artist {
    private String artistName;
    private List<Album> albums;

    public Artist(String artistName) {
        this.artistName = artistName;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
        System.out.println("Album added to the artist's collection");
    }

    public void deleteAlbum(Album album) {
        albums.remove(album);
        System.out.println("Album deleted from the artist's collection");
        
    }

    public void listAllAlbums() {
        System.out.println("Albums associated with the artist '" + artistName + "':");
        for (Album album : albums) {
            System.out.println("- " + album.getAlbumTitle());
        }
    }
}