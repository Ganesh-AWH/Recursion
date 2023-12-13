public class BS {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 7, 8, 100 };
        int target = 8;
        System.out.println(BinarySearch(arr, 0, arr.length - 1, target));
    }

    private static int BinarySearch(int[] arr, int s, int e, int target) {
        if (s > e)
            return -1;

        int mid = s + (e - s) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return BinarySearch(arr, s, mid - 1, target);

        return BinarySearch(arr, mid + 1, e, target);

    }
}