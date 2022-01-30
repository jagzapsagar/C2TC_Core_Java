import java.util.*;
public class AddFunc {
    
    public static int Sum(int a,int b) {

        int summ=a+b;
        
        return summ;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //AddFunc A=new AddFunc();
        //A.Sum(a,b);
        int sum = Sum(a,b);
        System.out.println(sum);
       
        



    }
    
}
