import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String[] splits = str.split(" ");
        for(int i = 0;i<splits.length;i++) {
            if(splits[i] != "") {
                count++;
            }
        }
        System.out.println(count);
    }
} 