package MyFiles;

public class singlyLinkedList {
    // ALL IMPLEMENTED WITHOUT A TAIL POINTER, KINDA STUPID BUT IDK.
    Node head;
    private int size = 0;

    public boolean isEmpty() {return head == null;}
    public int size() {return size;}

    public int value_at(int index){
        Node current = head;
        if(index > size){System.err.println("Out of Bounds"); return -1;}
        for(int i = 0; i < index; i++){ // Goes up to the index, we can remove one value from index as not considering 0 as thats head.
            current = current.next;
        }
        return current.data;

    }
    public void push_front(int data){
        size++;
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }
    public int pop_front(){
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }
    public void push_back(int value) {
        Node current = head;
        for (int i = 0; i < size-1; i++) { // Goes up to the index, we can remove one value from index as not considering 0 as thats head.
            current = current.next;
        }
        current.next = new Node(value);
        size++;
    }
    public int pop_back() {
        Node current = head;
        for (int i = 0; i < size-1; i++) { // Goes up to the index, we can remove one value from index as not considering 0 as thats head.
            current = current.next;
        }
        size--;
        int temp = current.data;
        current = null;
        return temp;
    }
    public int front(){return head.data;}
    public int back(){
        Node current = head;
        for (int i = 0; i < size-1; i++) {current = current.next;}
        return current.data;
    }
    public void insert(int index, int data){
        Node count = head;
        for(int i =0; i<index; i++){
            count = count.next;
        }
        Node temp = count;
        count = new Node(data);
        count.next = temp;
        size++;
    }
    public void erase(int index) {
        Node count = head;
        for(int i =0; i<index; i++){
            count = count.next;
        }
        count = count.next;
        size--;
    }
    public int value_n_from_end(int n){
        Node count = head;
        for(int i =0; i<size- n; i++){
            count = count.next;
        }
        return count.data;

    }
    public void remove_value(int data) {
        if(head.data == data){
            head = head.next;
            return;
        }
        Node count = head;
        while(count.next != null){
            if (count.next.data == data){
                count.next = count.next.next;
                return;
            }
            count = count.next;
        }
    }
    public void reverse() {
        Node prev = null;
        while(head != null){
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
    }
}
