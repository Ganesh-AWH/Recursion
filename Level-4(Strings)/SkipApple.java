public class SkipApple {
    public static void main(String[] args) {
        String s = "baxappledshf";
        StringBuilder ans = new StringBuilder();
        skipApple(s,ans);
        System.out.println(skipApple1(s));
    }
    private static void skipApple(String s,StringBuilder sb){
        if(s.isEmpty()){
            System.out.println(sb);
            return;
        }
        if(s.startsWith("apple")){
            skipApple(s.substring(5), sb);
        }
        // add else, if you does not have return type in the function for if the if-else condition
        else{
            skipApple(s.substring(1), sb.append(s.charAt(0)));
        }
    }
    private static String skipApple1(String s){
        if(s.isEmpty()){
            return "";
        }
        char c = s.charAt(0);
        if(s.startsWith("apple")){
            return skipApple1(s.substring(5));
        }else{
            return c + skipApple1(s.substring(1));
        }
    }
}
