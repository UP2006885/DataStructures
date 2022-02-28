package MyFiles;

import java.util.NoSuchElementException;
// Time complexity
// Enqueue, Dequeue, Peak, Empty.       O(1)
// Space complexity
// Enqueue, Dequeue, Peak, Empty.       O(1), Hold a reference so more space is used than an array.

public class circularLinkedQueue {
    Node rear;
    public circularLinkedQueue(Node rear){
        this.rear = rear;
        if(this.rear != null){
            this.rear.next = this.rear;
        }
    }

    public void enqueue(int data){
        Node n = new Node(data);
        if(rear == null){
            n.next = n;
        } else{
            n.next = rear.next;
            rear.next = n;
        }
        rear = n;
    }

    public int dequeue(){
        try{
        if(rear == null){
            throw new NoSuchElementException();
        }
        int temp = rear.next.data;
        if (rear.next == rear){
            rear = null;
        } else {
            rear.next = rear.next.next;
        }
        return temp;
        } catch(NoSuchElementException e){
            System.err.println(e + " / Queue empty");
        }
        return -1;
    }

    public int peak(){
        try{
            if(rear == null){
                throw new NoSuchElementException();
            }
            return rear.next.data;
        } catch(NoSuchElementException e){
            System.err.println(e + " / Queue empty");
        }
            return -1;
    }

    public boolean isEmpty(){
        return rear == null;
    }
}
