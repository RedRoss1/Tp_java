package Exercice3;

public class TestArray {
    public static void main(String[] args) {
        CustomArrayList c = new CustomArrayList();

        c.add("e1");
        c.add("e2");
        c.add("e3");

        System.out.println("Size: " + c.size());
        System.out.println("The list is empty: " + c.isEmpty());
        System.out.println("Does 'e2' occur in the list: " + c.isIn("e2"));
        System.out.println("Index of 'e3': " + c.find("e3"));

        c.add(1, "Inserted e");
        c.remove("e1");

        System.out.println("Size after modifications: " + c.size());
        System.out.println("Is 'e1' in the list: " + c.isIn("e1"));
    }
}
