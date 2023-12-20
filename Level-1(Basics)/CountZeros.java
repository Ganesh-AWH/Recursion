public class CountZeros {
    public static void main(String[] args) {
        int  n = 1030000050;
        System.out.println(countZero1(n));
    }
    private static int countZero(int n,int count){
        //base condition
        if(n == 0) return count;

        if(n%10 == 0) count++;

        return countZero(n/10, count);
    }

    //returning the count value without using argument
    private static int countZero1(int n){
        int count = 0;
        if(n == 0) return count;
        
        if(n%10 == 0) count ++;
        return count+countZero1(n/=10);
    }
}
