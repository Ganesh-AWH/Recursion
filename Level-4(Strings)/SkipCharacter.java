public class SkipCharacter{
    public static void main(String[] args) {
        String s1 = "acaadgkea";

        StringBuilder sb = new StringBuilder();
        skip(s1,sb);
    }
    private static void skip(String s1,StringBuilder sb){
        if(s1.isEmpty()){
            System.out.println(sb.toString());
            return;
        }

        char c = s1.charAt(0);

        if(c == 'a'){
            skip(s1.substring(1),sb);
        }else{
            skip(s1.substring(1),sb.append(c));
        }
    }
}