import java.util.ArrayList;
import java.util.List;

public class PalindromeSubstring {
    public static void main(String[] args) {
        String s = "eyelens";
        List<String> ans = new ArrayList<>();
        palindromeString(s, ans);
        System.out.println(ans);
    }
    private static void palindromeString(String s,List<String> ans){
        if(s.length()<3){
            return;
        }

        String sub = s.substring(0,3);

        if(isPalindrome(sub)){
            ans.add(sub);
        }
        palindromeString(s.substring(1), ans);
    }
    private static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
