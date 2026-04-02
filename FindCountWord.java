import java.util.*;

public class FindCountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        String[] splits = str.split(" ");
        HashMap<String, Integer> mpp = new HashMap<>();
        for(int i = 0;i<splits.length;i++) {
            String strr = "";
            for(int j = 0;j<splits[i].length();j++) {
                if(Character.isLetter(splits[i].charAt(j)))
                strr = strr + splits[i].charAt(j);
            }
            mpp.put(strr, mpp.getOrDefault(strr, 0)+1);
        }
        System.out.println(mpp.get(word));
    }
}