import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
        int n = 3;
        // dicePrint("",n);
        // List<String> ans = new ArrayList<>();
        // makeList("", n, ans);
        // System.out.println(ans);

        System.out.println(returnAsList("", n));
    }    
    private static void dicePrint(String processed,int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }
        // i<=target is to make only positive possible answer
        for(int i=1;i<=6 && i<=target;i++){
            dicePrint(processed+i, target-i);
        }
    }
    private static void makeList(String processed,int target,List<String> ans){
        if(target==0){
            ans.add(processed);
        }

        for(int i=1;i<=6 && i<=target;i++){
            makeList(processed+i, target-i, ans);
        }

    }

    private static List<String> returnAsList(String processed,int target){
        if(target == 0){
            List<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        List<String> outer = new ArrayList<>();
        for(int i = 1;i<=6 && target>=i;i++){
            List<String> inner = returnAsList(processed+i, target-i);
            outer.addAll(inner);
        }
        return outer;

    }
}
