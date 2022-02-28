package MyFiles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        choices();

    }

    public static void choices(){
        Scanner input = new Scanner(System.in);
        mutableArray mA = new mutableArray(input.nextInt());

        boolean doUntil = true;

        while(doUntil){
            prompt();

            switch(input.nextInt()) {
                case 1:
                    System.out.println("Size: "+ mA.size());
                    break;
                case 2:
                    System.out.println("Capacity: "+ mA.capacity());
                    break;
                case 3:
                    System.out.println("Is Empty?: "+ mA.isEmpty());
                    break;
                case 4:
                    System.out.println("Index: ");
                    int Index = input.nextInt();
                    System.out.println("Index Given: "+ Index + " Value present at Index: " + mA.at(Index));
                    break;
                case 5:
                    System.out.println("Value: ");
                    int val = input.nextInt();
                    mA.push(val);
                    break;
                case 6:
                    System.out.println("Index: ");
                    int ind1 = input.nextInt();
                    System.out.println("Value: ");
                    int val1 = input.nextInt();
                    mA.insert(ind1, val1);
                    break;
                case 7:
                    System.out.println("Value: ");
                    int val2 = input.nextInt();
                    mA.prepend(val2);
                    break;
                case 8:
                    System.out.println("Value popped: " + mA.pop());
                    break;
                case 9:
                    System.out.println("Index: ");
                    int ind2 = input.nextInt();
                    mA.delete(ind2);
                    break;
                case 10:
                    System.out.println("Value: ");
                    int val3 = input.nextInt();
                    mA.remove(val3);
                    break;
                case 11:
                    System.out.println("Value: ");
                    int val4 = input.nextInt();
                    System.out.println("Value found at index: " + mA.find(val4));
                    break;
                case 12:
                    doUntil = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }


    }
    public static void prompt(){
        String prompt = "---------------------------------------";
        System.out.println(prompt);
        System.out.println("Options");
        System.out.println(prompt);
        System.out.println("1 = size.");
        System.out.println("2 = capacity");
        System.out.println("3 = is_empty");
        System.out.println("4 = at, requires index");
        System.out.println("5 = push, requires value");
        System.out.println("6 = insert, requires index and value.");
        System.out.println("7 = prepend, requires value");
        System.out.println("8 = pop");
        System.out.println("9 = delete, requires index");
        System.out.println("10 = remove, requires value");
        System.out.println("11 = find, requires value");
        System.out.println("12 = quit");
        System.out.println(prompt);
    }
}
