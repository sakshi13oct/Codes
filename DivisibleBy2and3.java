import java.util.*;

public class DivisibleBy2and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int count = 0;
        for(int i = a;i<=b;i++) {
            if(i%2 == 0 && i%3 == 0) {
                count++;
                sum+=i;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}