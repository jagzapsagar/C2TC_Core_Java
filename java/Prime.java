import java.util.*;

public class Prime {
     public static void main(String[] args) {
        
        int flag=0;
        System.out.println("Enter No");
        Scanner sc=new Scanner(System.in);

        int no=sc.nextInt();

        if(no==0 || no==1)
        {
            flag=0;
        }
        else{
            for(int i=2;i<no;i++)
        {
            if(no%i==0){
                flag=0;
            }
            else{
                flag=1;
            }
           
        }

        }

        if(flag==0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Number is Prime"); 
        }

        
    }
    
}
