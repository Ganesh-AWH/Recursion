import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,3,2,1};

        bubbleSort1(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int []arr,int r,int c,int n){
        if(r==n) return;

        if(c<n-r-1){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1, n);
        }else{
            bubbleSort(arr, r+1, 0, n);
        }
    }
    private static void bubbleSort1(int []arr,int r,int c){
        if(r==0) return;

        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort1(arr, r, c+1);
        }else{
            bubbleSort1(arr, r-1, 0);
        }
    }
}
