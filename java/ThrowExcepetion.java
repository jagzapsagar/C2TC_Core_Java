import java.util.*;
public class ThrowExcepetion {

    public static void main(String[] args)
    throws InterruptedException {
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new ageException(age);
        }
        else
        {
            System.out.println("u can");
        }}
        catch(ageException e){
            System.out.println("catch");
        }
        
        finally {
        System.out.println("endddd");
    }
    }
    
}
/*class ageException extends RuntimeException{
    ageException(String msg)
    {
        
        super(msg);
    }
}*/

    
