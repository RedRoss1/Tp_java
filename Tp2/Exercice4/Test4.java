package Exercice4;

public class Test4 {
    public class OnlineMusicPlatform {
        public static void main(String[] args) {
            Song song1 = new Song("Shape of You", "Ed Sheeran", 200);
            Song song2 = new Song("Bohemian Rhapsody", "Queen", 300);
            Song song3 = new Song("Believer", "Imagine Dragons", 150);
    
            Album album1 = new Album("Divide");
            album1.addSong(song1);
            album1.addSong(song2);
    
            Artist artist1 = new Artist("Ed Sheeran");
            artist1.addAlbum(album1);
    
            FreeUser freeUser = new FreeUser();
            PremiumUser premiumUser = new PremiumUser();
    
            freeUser.listen(song1);
            freeUser.addToPlaylist(song1);
    
            premiumUser.listen(song2);
            premiumUser.addToPlaylist(song2);
    
            Playlist playlist = new Playlist(premiumUser);
            playlist.addSong(song1);
            playlist.addSong(song2);
            playlist.addSong(song3);

            artist1.listAllAlbums();
        }
    }
}
