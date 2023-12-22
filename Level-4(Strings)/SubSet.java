import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        // printSubset("",s);
        List<String> ans = new ArrayList<>();
        makeSubsetList(s,"",ans);
        System.out.println(ans);
        // System.out.println(makeSubsetList1(s,""));
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

    //passing list as argument and adding the subsets
    private static void makeSubsetList(String unprocessed,String processed,List<String> ans){
        if(unprocessed.isEmpty()){
            ans.add(processed);
            return;
        }

        char c = unprocessed.charAt(0);
        //including c        
        makeSubsetList(unprocessed.substring(1),processed+c,ans);
        //not including c
        makeSubsetList(unprocessed.substring(1), processed, ans);
    }

    //returning the list without using the arguments
    private static ArrayList<String> makeSubsetList1(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            ArrayList<String> ans  = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        char c = unprocessed.charAt(0);
        ArrayList<String> left = makeSubsetList1(unprocessed.substring(1), processed+c);
        ArrayList<String> right = makeSubsetList1(unprocessed.substring(1), processed);

        left.addAll(right);

        return left;
    }
}
