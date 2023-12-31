import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int []arr = {1,2,3};

        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> i:ans){
            System.out.println(i);
        }
    }
    private static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                //make copy of the outer array 
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    private static List<List<Integer>> subsetDuplicate(int []arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        //sorting is applied to make the duplicate element adjacent
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start =  end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
