import java.util.*;
public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] isPrimes = new int[100000];
        Arrays.fill(isPrimes, 1);
        isPrimes[0] = 0;
        isPrimes[1] = 0;
        for(int i = 2;i<100000;i++) {
            if(isPrimes[i] == 1) {
                for(int j = i*2;j<100000;j=j+i) {
                    isPrimes[j] = 0;
                }
            }
        }
        int count = 0;
        int n = sc.nextInt();
        while(n>0) {
            int digit = n%10;
            if(isPrimes[digit] == 1) {
                count++;
            }
            n = n/10;
        }
        
        System.out.println("Count of primes is : " + count);
    }
}