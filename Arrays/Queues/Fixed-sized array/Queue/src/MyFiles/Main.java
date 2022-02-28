package MyFiles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        choice();
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of queue: ");
        int size = scanner.nextInt();
        queue qu = new queue(size);
        boolean rL = true;

        while (rL) {
            prompt();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("IsEmpty?: "+ qu.isEmpty());
                    break;
                case 2:
                    System.out.println("Value: ");
                    qu.enqueue(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Dequeued Value: " + qu.dequeue());
                    break;
                case 4:
                    System.out.println(qu.toString());
                    break;

                default:
                    rL = false;
                    break;
            }

        }
    }

    public static void prompt() {
        System.out.println("Options");
        System.out.println("-----------------------------");
        System.out.println("1 = isEmpty");
        System.out.println("2 = Enqueue");
        System.out.println("3 = Dequeue");
        System.out.println("4 = ToString. (Testing)");
        System.out.println("-----------------------------");
    }
}
