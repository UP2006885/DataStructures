package MyFiles;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        choices();
    }

    public static void choices() {
        boolean doUntil = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Size of stack: ");
        stack stk = new stack(s.nextInt());
        while(doUntil) {
            prompt();
            switch (s.nextInt()) {
                case 1:
                    System.out.println("Peek: " + stk.peek());
                    break;
                case 2:
                    System.out.println("IsEmpty?: " + stk.isEmpty());
                    break;
                case 3:
                    System.out.println("Value: ");
                    int n = s.nextInt();
                    stk.push(n);
                    break;
                case 4:
                    System.out.println("Popped Value: " + stk.pop());
                    break;
                case 5:
                    System.out.println(stk.toString());
                    break;
                default:
                    doUntil = false;
                    break;
            }
        }
    }

    public static void prompt() {
        System.out.println("Options");
        System.out.println("-----------------------------");
        System.out.println("1 = Peek");
        System.out.println("2 = IsEmpty");
        System.out.println("3 = Push");
        System.out.println("4 = Pop");
        System.out.println("5 = toString - Testing");
        System.out.println("-----------------------------");

    }
}
