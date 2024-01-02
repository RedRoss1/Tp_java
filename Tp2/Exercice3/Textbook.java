package Exercice3;

class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    // Display information specific to Textbook
    public void display() {
        System.out.println("Textbook: " + getTitle() + " by " + getAuthor() + " (" + getyear() + ")");
        System.out.println("Subject: " + subject);
    }
}