import java.util.Scanner;

public class ArrayFindNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int size=sc.nextInt();
        int no[]=new int[size];
        System.out.println("Enter nos");
        for(int i=0;i<no.length;i++){
            no[i]=sc.nextInt();
        }

        System.out.println("Here is ur elements");
        for(int i=0;i<no.length;i++){
            System.out.println(no[i]);
        }
        System.out.println("Enter Element Which u want to find");
        int digit=sc.nextInt();
        for(int i=0;i<no.length;i++){
            if(digit==no[i]){
                System.out.println("ur no is fount at: "+i);
            }
        }
    }
    
}
