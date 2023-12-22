public class ReverseString {
    public static void main(String[] args) {
        String s = "abc";
        // System.out.println(reverse(s));
        String ans = "";
        System.out.println(reverse(s));
        System.out.println(ans);
    }
    private static String reverse(String s){
        if(s.isEmpty()){
            return "";
        }
        char c = s.charAt(0);

        String a = reverse(s.substring(1));
        return a+c;
    }
}
