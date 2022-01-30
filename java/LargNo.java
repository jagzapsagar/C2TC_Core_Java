import java.util.*;
public class LargNo {




    public static int Larger(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int larg=Larger(a,b);
        System.out.println("larg no is: "+larg);
    }
    
}
    
