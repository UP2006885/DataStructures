package MyFiles;

import java.util.Arrays;

public class stack {
    private int[] array;
    private int size = 0;
    private int capacity;

    public stack(int n) {
        this.array = new int[n];
        this.capacity = n;
    }

    public int peek() {try{return array[size - 1];}catch(Exception e){System.err.println("Stack is empty"); return -1;}}
    public boolean isEmpty() {return size == 0;}
    public void push(int n){try{array[size] = n; size++;}catch(Exception e){System.err.println("Stack is full");}}
    public int pop (){
        try {
            int temp = array[size - 1];
            array[size - 1] = 0;
            size--;
            return temp;
        } catch(Exception e){System.err.println("Stack is empty"); return -1;}

    }

    public String toString(){ // Used for testing.
        return "Cap: "+ capacity + ", size: " + size + ", array: " + Arrays.toString(array);
    }
}
