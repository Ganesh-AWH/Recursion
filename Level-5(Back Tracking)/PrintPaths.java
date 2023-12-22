import java.util.ArrayList;
import java.util.List;

public class PrintPaths {
    public static void main(String[] args) {
        print(3, 3, "");
        // List<String> ans = new ArrayList<>();
        // makeList(3, 3, "", ans);
        // System.out.println(ans);

        // System.out.println(pathRet(3,3,""));
        printDiagonal(3, 3, "");
    }
    private static void print(int r,int c,String processed){
        if(r==1 && c==1){
            System.out.println(processed);
            return;
        }
        
        if(r>1){
            print(r-1,c,processed+'D');
        }
        if(c>1){
            print(r,c-1,processed+'R');
        }
    }

    private static void makeList(int r,int c,String processed,List<String> ans){
        if(r==1 && c==1){
            ans.add(processed);
        }

        if(r>1){
            makeList(r-1, c, processed+'D', ans);
        }
        if(c>1){
            makeList(r,c-1,processed+'R',ans);
        }
    }
    private static List<String> pathRet(int r,int c,String processed){
        if(r==1 && c==1){
            List<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        List<String> left = new ArrayList<>(); 
        List<String> right = new ArrayList<>(); 
        if(r>1){
            left = pathRet(r-1, c, processed+"D");
        }
        if(c>1){
            right = pathRet(r, c-1, processed+'R');
        }
        left.addAll(right);
        return left;
    }

    //include diagonal path also
    private static void printDiagonal(int r,int c,String processed){
        if(r==1 && c==1){
            System.out.println(processed);
            return;
        }
        
        if(r>1){
            print(r-1,c,processed+'D');
        }
        if(c>1){
            print(r,c-1,processed+'R');
        }

        if(r>1 && c>1){
            print(r-1,c-1,processed+"DI");
        }
    }
}
