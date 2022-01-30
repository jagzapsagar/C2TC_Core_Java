import java.util.Scanner;

public class SumAllOddno {

   // Sum of all odd nos to given n

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        for(int i=1;i<=no;i++){
        if(i%2!=0){
            sum=sum+i;        
            

        }
       
    }
    System.out.println(sum);
        
    }
    
}
