import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumPad {
    
    static Map<String,String> map = new HashMap<>();
    public static void main(String[] args) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        String s = "23";
        List<String> ans = new ArrayList<>();
        helper("",s,ans);
        System.out.println(ans);
        System.out.println(countPad("", s));
    }
    private static void helper(String processed,String unprocessed,List<String> ans){
        if(unprocessed.isEmpty()){
            ans.add(processed);
            return;
        }

        String x = unprocessed.substring(0,1);
        String letters = map.get(x); 
        for(int i=0;i<letters.length();i++){
            char c = letters.charAt(i);
            helper(processed+c,unprocessed.substring(1),ans);
        }
    }

    private static int countPad(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }

        int count = 0;
        String letters = map.get(unprocessed.substring(0, 1));
        for(int i=0;i<letters.length();i++){
            char c = letters.charAt(0);
            count += countPad(processed+c, unprocessed.substring(1));
        }
        return count;
    }
}
