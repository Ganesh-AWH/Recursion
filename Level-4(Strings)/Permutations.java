import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String s = "123";

        printPermutations("",s);
        List<String> ans = new ArrayList<>();
        makePermutationsList("",s,ans);
        System.out.println(makePermutations("", s));
    }
    private static void printPermutations(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char c = unprocessed.charAt(0);

        for(int i=0;i<=processed.length();i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            printPermutations(first+c+second, unprocessed.substring(1));
        }
    }
    
    private static void makePermutationsList(String processed,String unprocessed,List<String> ans){
        if(unprocessed.isEmpty()){
            ans.add(processed);
            return;
        }

        char c = unprocessed.charAt(0);

        for(int i=0;i<=processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i,processed.length());

            makePermutationsList(first+c+second, unprocessed.substring(1), ans);
        }
    }

    private static ArrayList<String> makePermutations(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        char c = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i,processed.length());
            ans.addAll(makePermutations(first+c+second, unprocessed.substring(1)));
        }
        return ans;
    }
}
