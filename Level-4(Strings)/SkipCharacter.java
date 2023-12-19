public class SkipCharacter{
    public static void main(String[] args) {
        String s1 = "acaadgkea";

        StringBuilder sb = new StringBuilder();
        skip1(s1,sb);
        System.out.println(skip2(s1));
    }
    private static void skip1(String s1,StringBuilder sb){
        if(s1.isEmpty()){
            System.out.println(sb.toString());
            return;
        }

        char c = s1.charAt(0);

        if(c == 'a'){
            skip1(s1.substring(1),sb);
        }else{
            skip1(s1.substring(1),sb.append(c));
        }
    }

    private static String skip2(String s){
        if(s.isEmpty()) return "";
        char c = s.charAt(0);
        if(c == 'a') return skip2(s.substring(1));

        return c + skip2(s.substring(1));
    }
}