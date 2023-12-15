public class StringPalindrome {
    public static void main(String[] args) {
        String s = "rr";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
    private static boolean isPalindrome(String s,int l,int h){
        if(l>h) return true;

        if(s.charAt(l) == s.charAt(h)) return isPalindrome(s, l+1, h-1);
        return false;
    }

}
