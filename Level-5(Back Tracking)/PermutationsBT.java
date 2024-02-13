import java.util.ArrayList;
import java.util.List;

public class PermutationsBT{
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper1(arr,ans,new ArrayList<>());
        System.out.println(ans);
    }
    private static void helper1(int []arr,List<List<Integer>> ans,List<Integer> temp){
        //check if the temp size is equal to array size
        if(temp.size()==arr.length){
            //if equal then add it to the ans
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(temp.contains(arr[i])) continue;
            temp.add(arr[i]);
            helper1(arr, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
}