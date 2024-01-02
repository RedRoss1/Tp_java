package Exercice4;

class Song {
    private String title;
    private String artist;
    private int songLength;

    public Song(String title, String artist, int songLength) {
        this.title = title;
        this.artist = artist;
        this.songLength = songLength;
    }

    public void playSong() {
        System.out.println(title + "is playing");
    }

    public int getSongLength() {
        return songLength;
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }
}

