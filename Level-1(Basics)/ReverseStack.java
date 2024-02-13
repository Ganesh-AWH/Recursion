import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
    private static void reverseStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int temp = s.pop();
            reverseStack(s);
            pushElement(s,temp);
        }
    }
    private static void pushElement(Stack<Integer> s,int ele){
        if(s.isEmpty()){
            s.push(ele);
            return;
        }
        int temp = s.pop();
        pushElement(s, ele);
        s.push(temp);
    }

}
