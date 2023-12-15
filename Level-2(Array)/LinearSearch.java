import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,4,5};
        int target = 4;
        // System.out.println(search(arr,0,target));
        // findAllIndex(arr, 0, target);
        // System.out.println(li);
        System.out.println(findAllIndex2(arr, 0, target));
    }    
    private static int search(int []arr,int i,int target){
        if(i==arr.length) return -1;

        if(arr[i] == target) return i;

        return search(arr, i+1, target);
    }

    static List<Integer> li = new ArrayList<>();
    //finding duplicate target index
    private static void findAllIndex(int []arr,int i,int target){
        if(i==arr.length) return;

        if(arr[i]==target) li.add(i);

        findAllIndex(arr, i+1, target);
    }
    //finding duplicate target index with return list

    //list will created for every function call but object is the same so changes are reflected in every list
    private static ArrayList<Integer> findAllIndex1(int []arr,int i,int target,ArrayList<Integer> list){
        if(i==arr.length) return list;

        if(arr[i] == target) list.add(i);

        return findAllIndex1(arr, i+1, target, list);
    }

    //dont passing list as arguments
    private static ArrayList<Integer> findAllIndex2(int []arr,int i,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;

        if(arr[i] == target) list.add(i);

        ArrayList<Integer> belowAns = findAllIndex2(arr, i+1, target);

        list.addAll(belowAns);

        return list;
    }
}
