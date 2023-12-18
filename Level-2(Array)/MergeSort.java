import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int []arr = {9,20,1,4,6,10};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] mergeSort(int []arr){
        if(arr.length==1) return arr;

        int mid = arr.length/2;

        int []left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int []right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    private static int[] merge(int []left,int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int sorted[] = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                sorted[k] = left[i];
                i++;
            }else{
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        //copying the remaining elements
        while(i<left.length){
            sorted[k++] = left[i++];
        }

        while(j<right.length){
            sorted[k++] = right[j++];
        }

        return sorted;
    }
}