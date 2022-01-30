import java.util.Scanner;

public class Fact {
    
    public static void Fact(int n)
    {
        if(n<=0){
            System.out.println("Invalid No");
            
            

        }
        else{
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);}
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fact(n);
        
        
    }
    
}
