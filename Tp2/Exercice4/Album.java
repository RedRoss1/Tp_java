package Exercice4;

import java.util.ArrayList;
import java.util.List;

class Album {
    private String albumTitle;
    private List<Song> songs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to the album");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Song removed from the album");

    }


    public void listAllSongs() {
        System.out.println("Songs in the album " + albumTitle + ":");
        for (Song song : songs) {
            System.out.println("- " + song.getTitle() + " by " + song.getArtist());
        }
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
}
