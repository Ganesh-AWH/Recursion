import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsSwap {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,ans,0);
        System.out.println(ans);
    }
    private static void helper(int []arr,List<List<Integer>> ans,int index){
        if(index == arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int i:arr) temp.add(i);

            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            helper(arr,ans,index+1);
            swap(arr,i,index);
        }
    }
    private static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
