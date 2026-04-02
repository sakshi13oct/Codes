import java.util.*;
public class CountWordVowel {
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine().toLowerCase();
        String[] splits = str.split(" ");
        for(int i = 0;i<splits.length;i++) {
            if(splits[i] != "") {
                if(isVowel(splits[i].charAt(0))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}