package Exercice3;

interface LibraryUser {
    void borrowBook(Book book);
    void returnBook(Book book);
}

class Student implements LibraryUser {
    private String studentName;
    private LibraryCard libraryCard;

    public Student(String studentName, int number, int year) {
        this.studentName = studentName;
        this.libraryCard = new LibraryCard(number, year);
    }

    public void borrowBook(Book book) {
        System.out.println(studentName + " borrowed the book: " + book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(studentName + " returned the book: " + book.getTitle());
    }
}