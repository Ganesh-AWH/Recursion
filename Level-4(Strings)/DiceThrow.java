import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
        int n = 3;
        dicePrint("",n);
        List<String> ans = new ArrayList<>();
        makeList("", n, ans);
        System.out.println(ans);
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
}
