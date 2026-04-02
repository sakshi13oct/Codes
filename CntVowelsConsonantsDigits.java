import java.util.*;

public class CntVowelsConsonantsDigits {
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch =='u') {
            return true;
        }
        return false;
    }
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        int cntConsonants = 0;
        int cntDigits = 0;
        int cntVowels = 0;
        String str = sc.nextLine().toLowerCase();
        for(int i = 0;i<str.length();i++) {
            if(Character.isLetter(str.charAt(i))) {
                if(isVowel(str.charAt(i))) {
                    cntVowels++;
                } else {
                    cntConsonants++;
                }
            }
            else {
                cntDigits++;
            }
        }
        System.out.println("Number of vowels : " + cntVowels);
        System.out.println("Number of consonants : " + cntConsonants);
        System.out.println("Number of digits : " + cntDigits);

    }
}