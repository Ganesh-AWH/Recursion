/*

 * * * *
 * * * *
 * * * *
 * * * *

 */
public class Pattern3 {
    public static void main(String[] args) {
        int r = 4;
        pattern(0,0,r);
    }
    private static void pattern(int r,int c,int n){
        if(r==n) return;

        if(c<n){
            System.out.print("* ");
            pattern(r, c+1, n);
        }else{
            System.out.println();
            pattern(r+1,0,n);
        }
    }
}
