import java.util.Scanner;

public class Avgofthree {

    public static int Avg(int a, int b, int c){
        int avg,sum;
        sum=a+b+c;
        avg=sum/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=Avg(a, b, c);
        System.out.println(avg);

        
    }
    
}
