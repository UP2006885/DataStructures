package MyFiles;

import java.util.Arrays;

public class queue {
    private int[] array;
    private int capacity;
    private int size = 0;

    public queue(int n) {
        this.array = new int[n];
        this.capacity = n;
    }
    public boolean isEmpty() {return size == 0;}
    public void enqueue(int value){try{array[size] = value; size++;}catch(Exception e){System.err.println("Queue Full");}}
    public int dequeue() {int temp = array[0];
        try{
            if(size == 0){System.err.println("Queue empty"); return -1;}
            if(size < 2){array[0] = 0; size--; return temp;}
            for(int i = 0; i < size-1; i++){
                array[i] = array[i + 1];
            }
            array[size-1] = 0;
            size--;
        } catch(Exception e){System.err.println("Queue empty");};
        return temp;
    }

    public String toString() {return "Cap: " + capacity + ", size: "+size+ ", array: " + Arrays.toString(array);}
}
