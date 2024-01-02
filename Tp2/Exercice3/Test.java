package Exercice3;

public class Test {
    public static void main(String[] args) {

        Novel novel = new Novel("The brothers karamazov", "Dostoievsky", 1960, "Classic");
        Textbook textbook = new Textbook("Introduction to Java", "John Doe", 2022, "Programming");

        Library library = new Library();

        library.addBook(novel);
        library.addBook(textbook);

        library.listAllBooks();

        Student student = new Student("Ali",1234,2025);
        Teacher teacher = new Teacher("Mohamed",9876, 2026);

        student.borrowBook(novel);
        teacher.borrowBook(textbook);

        student.returnBook(novel);
        teacher.returnBook(textbook);

        library.removeBook(novel);


    }
}
