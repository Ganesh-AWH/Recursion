/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class Pattern4 {
    public static void main(String[] args) {
        int row = 5;
        pattern(1,1,row);
    }
    private static void pattern(int r,int c,int n){
        if(r==n+1) return;
        if(c<=r){
            System.out.print(c+" ");
            pattern(r,c+1,n);
        }else{
            System.out.println();
            pattern(r+1,1,n);
        }
    }
}
