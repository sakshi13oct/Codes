import java.util.*;
public class StartEndSameLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        int count = 0;
        String str = sc.nextLine().toLowerCase();
        String[] splits = str.split(" ");
        for(int i = 0;i<splits.length;i++) {
            if(splits[i].charAt(0) == splits[i].charAt(splits[i].length()-1)) {
                count++;
                ans.add(splits[i]);
            }
        }
        for(int i = 0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
        System.out.println(count);
    }
}