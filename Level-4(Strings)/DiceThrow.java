public class DiceThrow {
    public static void main(String[] args) {
        int n = 3;
        dicePrint("",n);
    }    
    private static void dicePrint(String processed,int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }
        // i<=target is to make only positive possible answer
        for(int i=1;i<=6 && i<=target;i++){
            dicePrint(processed+i, target-i);
        }
    }
}
