import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = new int[]{5,3,7,2,1};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void selection(int []arr,int r,int c,int maxIndex){
        if(r==0) return;

        if(c<r){
            if(arr[maxIndex]<arr[c]){
                maxIndex = c;
            }
            selection(arr,r,c+1,maxIndex);
        }else{
            swap(arr,r,maxIndex);
            selection(arr, r-1, 0, 0);
        }
    }
}
