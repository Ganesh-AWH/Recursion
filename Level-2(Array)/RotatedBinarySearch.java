public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = new int[]{5,6,1,2,3};

        int target = 1;
        System.out.println(search(arr,0,arr.length-1,target));
    }
    private static int search(int []arr,int s,int e,int target){
        if(s>e) return -1;

        int mid = s+(e-s)/2;

        if(arr[mid]==target) return mid;

        //case -1
        //if start to end is sorted

        if(arr[s]<= arr[mid]) {
            //check the key is in the range
            if(target >=arr[s] && target<=arr[mid]) return search(arr,s,mid-1,target); 
            else return search(arr, mid+1, e, target);
        }
        //case -2
        //if start to end is not sorted

        if(target>=arr[mid] && target<=arr[mid]) return search(arr, mid+1, e, target);

        else return search(arr, s, mid-1, target);
    }
}
