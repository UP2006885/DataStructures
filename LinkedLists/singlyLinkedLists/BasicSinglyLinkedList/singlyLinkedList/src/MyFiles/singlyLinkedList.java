package MyFiles;

public class singlyLinkedList {
    Node head;

    public void append(int data) {
        if (head == null){head = new Node(data); return;}
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteValue(int data) {
        if(head == null){return;}
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

    public String toString(){
        String s = "Values stored in list: ";
        Node count = head;
        if(head == null){return "Head empty";}

        while(count.next != null){
            s += count.data + ", ";
            count = count.next;
        }
        s += count.data;
        return s;
    }
}
