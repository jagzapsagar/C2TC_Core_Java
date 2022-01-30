//package java sample programs.BitManipulation;

public class BitOne {
    public static void main(String[] args) {
        int n=5;//0101
        int p=2;
        int bitMask=1<<p;

        if((bitMask & n)==0){
            System.out.println("Zero");
        }else{
            System.out.print("One");
        }
    }
    
}
