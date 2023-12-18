class Pattern1{
    public static void main(String[] args) {
        int n = 5;
        Pattern(n,0);
    }
    private static void Pattern(int r,int c){
        if(r==0) return ;

        if(c<r){
            System.out.print("* ");
            Pattern(r,c+1);
        }else{
            System.out.println();
            Pattern(r-1,0);
        }
    }
}