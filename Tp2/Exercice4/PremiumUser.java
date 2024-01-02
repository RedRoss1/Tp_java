package Exercice4;

import java.util.ArrayList;
import java.util.List;

interface User {
    void listen(Song song);
    void addToPlaylist(Song song);
}

class PremiumUser implements User {
    private List<Song> playlist;

    public PremiumUser() {
        this.playlist = new ArrayList<>();
    }

    public void listen(Song song) {
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        playlist.add(song);
        System.out.println("Song added to the playlist");
    }

    public void removeFromPlaylist(Song song) {
        playlist.remove(song);
        System.out.println("Song removed from playlist");
    }
}
