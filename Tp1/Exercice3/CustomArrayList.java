package Exercice3;

public class CustomArrayList {

    private Object[] array;
    private int size;

    public CustomArrayList() {
        this.array = new Object[10];
        this.size = 0;
    }

    public CustomArrayList(int initialSize) {
        if (initialSize < 0) {
            System.out.println("the initial size cannot be negative");
            System.exit(1);
        }
        this.array = new Object[initialSize];
        this.size = 0;
    }

    public void add(Object obj) {
        array[size+1] = obj;
        size++;
    }

    public void add(int index, Object x) {
        if (index < 0 || index > size) {
            System.out.println("please check the index");
            System.exit(1);
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
             System.out.println("please check the index");
            System.exit(1);
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isIn(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object x) {//this method replaces the first occurence of the object to remove with the last element of the list
        int index = find(x);
        if (index != -1) {
            array[index] = array[size-1];
            size--;
            array[size] = null; 
            }
    }

}