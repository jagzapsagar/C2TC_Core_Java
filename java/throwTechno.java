import java.util.Scanner;

public class throwTechno {
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            throw new ageException("Age excption ahe");
        }
        else
        {
            System.out.println("u can");
        }
    }
    
}
class ageException extends RuntimeException{
    ageException(String msg)
    {
        super(msg);
    }
}
