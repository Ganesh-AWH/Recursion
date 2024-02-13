import java.util.*;

public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        
        //create char array it will be very easy
        char []arr = new char[n];
        Arrays.fill(arr,'0');
        List<String> ans = new ArrayList<>();
        helper(arr,n,0,ans);
        System.out.println(ans);
    }
    private static void helper(char []arr,int n,int index,List<String> ans){
        if(index == n){
            ans.add(new String(arr));
            return;
        }

        for(int i=index;i<n;i++){
            arr[i] = '0';
            helper(arr,n,i+1,ans);
            arr[i] = '1';
            helper(arr,n,i+1,ans);
        }
    }
}
