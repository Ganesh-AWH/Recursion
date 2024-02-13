import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,ans,new ArrayList<>(),0);
        System.out.println(ans);
    }
    private static void helper(int []arr,List<List<Integer>> ans , List<Integer> temp,int index){
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            helper(arr,ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
