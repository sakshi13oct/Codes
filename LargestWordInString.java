import java.util.*;

public class LargestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxi = Integer.MIN_VALUE;
        String ans = null;
        String[] splits = str.split(" ");
        for(int i = 0;i<splits.length;i++) {
            if(maxi < splits[i].length()) {
                maxi = splits[i].length();
                ans = splits[i];
            }
        }
        System.out.println(ans);
    }
}