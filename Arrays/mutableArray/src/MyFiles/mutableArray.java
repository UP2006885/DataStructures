package MyFiles;

public class mutableArray {
//    mutable array with automatic resizing
    private int[] array;
    private int[] tempArray;
    private int capacity;
    private int size = 0;

    public mutableArray(int n) {
        System.out.println(n + "^2 = " + n*n);
        if (n <= 16){this.array = new int[16];
        } else{
            this.array = new int[n*n];
        }
        this.capacity = this.array.length;
    }

    private void resize(int n){
        tempArray = array;
        switch(n){
            case 0:
                array = new int[capacity + capacity];
                capacity += capacity;
                break;
            case 1:
                array = new int[((int)capacity/4)];
                capacity = ((int)capacity/4);
                break;
        }

    }

    private void checkShinking(){
        if(size <= ((int)capacity/4)){resize(1);}
    }

    private void checkResize(){
        if(size < (capacity-1)){ // We must have space available at all times to account for right shifting
            System.out.println("There are "+ (capacity - size) + " spaces left in the array.");
        } else {resize(0);}
    }

    public int capacity() {return capacity;}
    public int size() {return size;}
    public boolean isEmpty() {if (size == 0){return true;} return false;}

    public int at(int i) {
        try {
            return array[i];
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
            return 0;
        }
    }

    public void push(int value){
        array[size] = value;
        size++;
        checkResize();
    }

    public int pop (){
        size--;
        checkShinking();
        return array[size];

    }

    public void insert(int index, int value){
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;

        checkResize();
    }

    public void prepend(int value){
        if(size == 0){array[0] = value;} else {
            for (int i = size; i > 0; i--) {
                array[i] = array[i-1];
            }
            array[0] = value;
        }
        size++;
        checkResize();
    }

    public void delete(int index){
        array[index] = 0;
        for(int i = index; i < size; i++){
            array[i] = array[i+1];
        }
        size--;
        checkResize();
    }
    public void remove(int value){
        int temp = 0;
        while(true){
            temp = find(value);
            if(temp != -1){array[temp] = 0;} else{break;}
        }
    }

    public int find(int value){
        for(int i = 0; i < size; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }



}
