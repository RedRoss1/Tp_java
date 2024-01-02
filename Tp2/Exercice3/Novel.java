package Exercice3;

class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }


    public void display() {
        System.out.println("Novel: " + getTitle() + " by " + getAuthor() + " (" + getyear() + ")");
        System.out.println("Genre: " + genre);
    }
}