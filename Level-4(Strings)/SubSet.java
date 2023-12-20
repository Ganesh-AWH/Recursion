import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        printSubset("",s);
        List<String> ans = new ArrayList<>();
        makeSubsetList(s,"",ans);
        System.out.println(ans);
    }
    private static void printSubset(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char c = unprocessed.charAt(0);

        printSubset(processed+c, unprocessed.substring(1));
        printSubset(processed, unprocessed.substring(1));
    }

    
    private static void makeSubsetList(String unprocessed,String processed,List<String> ans){
        if(unprocessed.isEmpty()){
            ans.add(processed.toString());
            return;
        }

        char c = unprocessed.charAt(0);
        makeSubsetList(unprocessed.substring(1),processed+c,ans);
        makeSubsetList(unprocessed.substring(1), processed, ans);
    }
}
