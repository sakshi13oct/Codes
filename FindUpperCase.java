import java.util.*;
public class FindUpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splits = str.split(" ");
        int count = 0;
        for(int i = 0;i<splits.length;i++) {
            if(Character.isUpperCase(splits[i].charAt(0))) {
                count++;
            }
        }
        System.out.print(count);
    }
}