package MyFiles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boolean doUntil = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int size = scanner.nextInt();
        dynamicArray array = new dynamicArray(size);

        while(doUntil){
            choices();
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Index: ");
                    System.out.println(array.get(scanner.nextInt()));
                    break;
                case 1:
                    System.out.println("Index: ");
                    int Index = scanner.nextInt();
                    System.out.println("Value: ");
                    array.set(Index, scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Value: ");
                    array.pushback(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Index: ");
                    array.remove(scanner.nextInt());
                    break;
                case 4:
                    System.out.println(array.size());
                    break;
                case 5:
                    doUntil = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }

    public static void choices(){
        System.out.println("---------------------------");
        System.out.println("0 = Get dependant on index given.");
        System.out.println("1 = Set dependant on index & value given.");
        System.out.println("2 = Pushback adds value at current end of array(After last stored int).");
        System.out.println("3 = Removes value dependant on index given, and pushes the array items after that given index back one.");
        System.out.println("4 = Size.");
        System.out.println("5 = Quit.");
        System.out.println("---------------------------");


    }
}
