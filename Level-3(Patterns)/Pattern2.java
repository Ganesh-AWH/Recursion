public class Pattern2 {
    public static void main(String[] args) {
        int r = 4;
        pattern1(1, 1,4);
    }
    //approach 1
    private static void pattern(int r,int c){
        if(r==0) return;

        if(c<r){
            pattern(r,c+1);
            System.out.print("* ");
        }else{
            pattern(r-1,0);
            System.out.println();
        }
    }
    private static void pattern1(int r,int c,int n){
        if(r==n+1) return;

        if(c<=r){
            System.out.print("* ");
            pattern1(r, c+1,n);
        }else{
            System.out.println();
            pattern1(r+1, 1, n);
        }
    }
}
