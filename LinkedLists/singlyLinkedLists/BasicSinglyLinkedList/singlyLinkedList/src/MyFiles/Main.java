package MyFiles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean db = true;
	// write your code here
        Scanner scanner = new Scanner(System.in);
        singlyLinkedList sLL = new singlyLinkedList();
        while(db){
            prompt();

            switch(scanner.nextInt()){
                case 1:
                    System.out.println("Value: ");
                    sLL.append(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Value: ");
                    sLL.prepend(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Value: ");
                    sLL.deleteValue(scanner.nextInt());
                    break;
                case 4:
                    System.out.println(sLL.toString());
                    break;
                default:
                    db = false;
                    break;
            }
        }
    }
    public static void prompt() {
        System.out.println("Options");
        System.out.println("--------------------------");
        System.out.println("1 = append");
        System.out.println("2 = prepend");
        System.out.println("3 = delete");
        System.out.println("4 = toString (Testing)");
        System.out.println("--------------------------");

    }
}
