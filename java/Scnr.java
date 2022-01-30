
import java.util.*;


public class Scnr {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int no=sc.nextInt();
        //int no=10;
        do {
            System.out.println(no);
            --no;
        }while (no>=1);

    }
}
