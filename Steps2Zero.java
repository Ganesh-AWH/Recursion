//Given an integer num return the number of steps to reduce it to zero.

//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
//use recursion to solve this problem

public class Steps2Zero{
    public static void main(String[] args) {
        int n = 14;
        System.out.println(countStep(n));
    }
    private static int countStep(int n){
        return helper(n,0);
    }
    private static int helper(int n,int count){
        if(n == 0) return count;

        if(n%2==0) n/=2;
        else n-=1;

        return helper(n,count+1);
    }
}