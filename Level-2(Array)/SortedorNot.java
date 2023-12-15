public class  SortedorNot{
    public static void main(String[] args) {
        int []arr = new int[]{1,2,5,3,6,10};

        System.out.println(isSorted(arr,0,arr.length-1));
        System.out.println(sorted(arr, 0));
    }

    //approach 1 (My approach)
    public static boolean isSorted(int []arr,int s,int e){
        if(s==e) return true;

        if(arr[s] > arr[s+1]) return false;

        return isSorted(arr, s+1, e);
    }
    //approach 2 (In youtube)
    private static boolean sorted(int []arr,int i){
        if(i == arr.length-1) return true;

        return arr[i] < arr[i+1] && sorted(arr, i+1);
    }
}