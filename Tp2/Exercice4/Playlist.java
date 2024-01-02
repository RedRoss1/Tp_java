package Exercice4;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Song> songs;
    private User user;

    public Playlist(User user) {
        this.songs = new ArrayList<>();
        this.user = user;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to the playlist");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Song removed from the playlist");
    }

}
