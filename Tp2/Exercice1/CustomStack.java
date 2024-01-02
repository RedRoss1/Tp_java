package Exercice1;

public class CustomStack {
    private int capacity;
    private int size;
    private Object[] stack;


    public CustomStack(int capacity) {
        if (capacity <= 0) {
            System.out.println("the capacity cannot be negative");
        }
        this.capacity = capacity;
        this.size = 0;
        this.stack = new Object[capacity];
    }

    public void addElement(Object element) {
        if (size == capacity) {
            System.out.println("stack is full");
        }
        stack[size+1] = element;
        size++;
    }

    public void removeElement() {
        if (size == 0) {
            System.out.println("the stack is empty");
        }
        stack[size] = null;
        size--;
    }

    public Object lastInStack() {
        if (size == 0) {
            System.out.println("Stack is empty.");
        }
        return stack[size - 1];
    }

    public boolean stackIsEmpty() {
        return (size == 0);
    }

    public boolean stackIsFull() {
        return size == capacity;
    }

    public static void main(String[] args) {

        CustomStack customStack = new CustomStack(5);

        System.out.println("Is the stack empty :" + customStack.stackIsEmpty());

        customStack.addElement("e1");
        customStack.addElement("e2");
        customStack.addElement("e3");

        System.out.println("Last element in the stack: " + customStack.lastInStack());
        System.out.println("Is  the stack full :" + customStack.stackIsEmpty());


        customStack.removeElement();
    }
}