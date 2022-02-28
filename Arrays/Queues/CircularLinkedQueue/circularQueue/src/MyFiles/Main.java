package MyFiles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dod = true;
        System.out.println("Node data: ");
        Scanner scanner = new Scanner(System.in);
        circularLinkedQueue clq = new circularLinkedQueue(new Node(scanner.nextInt()));
        while(dod){
            prompt();
            switch(scanner.nextInt()){
                case 1:
                    System.out.println("IsEmpty?: " + clq.isEmpty());
                    break;
                case 2:
                    System.out.println("Peak: " + clq.peak());
                    break;
                case 3:
                    System.out.println("Value: ");
                    clq.enqueue(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Dequeued Value: " + clq.dequeue());
                    break;
                default:
                    dod = false;
                    break;
            }
        }

    }

    public static void prompt() {
        System.out.println("Options");
        System.out.println("---------------------");
        System.out.println("1 = IsEmpty");
        System.out.println("2 = Peak");
        System.out.println("3 = Enqueue");
        System.out.println("4 = Dequeue");
        System.out.println("---------------------");

    }
}
