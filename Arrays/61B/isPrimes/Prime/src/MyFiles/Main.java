package MyFiles;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        isPrime primes = new isPrime(n);
        primes.outputPrimes();
    }
}
