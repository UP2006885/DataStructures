package MyFiles;

public class dynamicArray {
    private int[] defaultArray;
    private int[] tempArray;
    private int capacity;
    private int elementsInArray = 0;
    public dynamicArray(int n) {defaultArray = new int[n]; this.capacity = n;}

    private void increaseArray(){
        tempArray = defaultArray;
        defaultArray = new int[capacity + 10];
        for(int i = 0; i <capacity; i++){
            defaultArray[i] = tempArray[i];
        }
        capacity += 10;
    }

    public int get(int index){
        return defaultArray[index];
    }

    public void set(int index, int value){
        defaultArray[index] = value;
        elementsInArray++;
        if(elementsInArray == capacity){increaseArray();}
    }

    public void pushback(int value){
        defaultArray[elementsInArray] = value;
        elementsInArray++;
        if(elementsInArray == capacity){increaseArray();}

    }

    public void remove(int index){
        defaultArray[index] = 0;
        for(int i = index+1; i <= elementsInArray; i++) {
            defaultArray[i-1] = defaultArray[i];
        }
        elementsInArray--;
        if(elementsInArray == capacity){increaseArray();}

    }

    public String size() {return "The length of the array is "+capacity+" with " +elementsInArray+" elements currently in the array.";}
}
