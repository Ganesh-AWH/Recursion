import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int []arr,int s,int e){
        if(e-s == 1) return;

        int mid = s + (e-s)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr,  mid, e);

        merge(arr,s,mid,e);
    }
    private static void merge(int []arr,int s,int mid,int e){
        int []sorted = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]) sorted[k] = arr[i++];
            else sorted[k] = arr[j++];
            k++;
        }
        while(i<mid){
            sorted[k++] = arr[i++];
        }
        while(j<e){
            sorted[k++] = arr[j++];
        }

        for(k=0;k<sorted.length;k++){
            arr[k+s] = sorted[k];
        }
    }
}
