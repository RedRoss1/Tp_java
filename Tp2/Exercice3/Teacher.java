package Exercice3;

class Teacher implements LibraryUser {
    private String teacherName;
    private LibraryCard libraryCard;

    public Teacher(String teacherName, int number, int year) {
        this.teacherName = teacherName;
        this.libraryCard = new LibraryCard(number,year);
    }

    public void borrowBook(Book book) {
        System.out.println(teacherName + " borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.println(teacherName + " returned the book: " + book.getTitle());
    }
}
