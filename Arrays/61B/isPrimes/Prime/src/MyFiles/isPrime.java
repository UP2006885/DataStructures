package MyFiles;

public class isPrime {
    private int n;
    private boolean[] primes;

    public isPrime(int n) {
        this.n = n;
        this.primes = new boolean[n + 1];
    }

    private void setDefaultBooleans(){
        for(int i = 2; i <= n; i++){primes[i] = true;}
//        return primes;
    }

    private void checkPrimes(){
        setDefaultBooleans();
        for(int divisor =2; divisor * divisor <=n; divisor++){
            if(primes[divisor]){
                for(int i = 2 * divisor; i <=n; i = i+divisor){
                    primes[i] = false;
                }
            }
        }
    }

    public void outputPrimes(){
        checkPrimes();
        for(int i = 2; i<=n; i++){
            if(primes[i]){
                System.out.println("Prime Number: " + i);
            }
        }
    }

}
