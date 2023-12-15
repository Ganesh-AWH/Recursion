public class CountZeros {
    public static void main(String[] args) {
        int  n = 1030000050;
        System.out.println(countZero(n,0));
    }
    private static int countZero(int n,int count){
        //base condition
        if(n == 0) return count;

        if(n%10 == 0) count++;

        return countZero(n/10, count);
    }
    
}
