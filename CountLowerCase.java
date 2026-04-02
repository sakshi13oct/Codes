import java.util.*;

public class CountLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}