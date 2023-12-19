import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,6,1,3,19,34,64,14};

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int []arr,int i,int j){
        if(i>=j) return;

        int p = partition(arr,i,j);
        quickSort(arr, i, p-1);
        quickSort(arr, p+1, j);
    }
    private static int partition(int []arr,int start,int end){
        int i = start;
        int j = end;
        int pivotIndex = start;
        while(true){
            while(arr[pivotIndex]>arr[i] && i<=end) i++;

            while(arr[pivotIndex]<arr[j] && j>=start) j--;

            if(i>=j){
                swap(arr,j,pivotIndex);
                return j;
            }
            swap(arr,i,j);
        }
    }
    private static void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
