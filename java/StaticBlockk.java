//package java sample programs;

public class StaticBlockk {
static int b=15;

static void disp(){
    System.out.println(" Disp method "+ b);

}


    static{
    System.out.println("Static block 1");
    }
    public static void main(String[] args) {

        System.out.println("Main Method");
        StaticBlockk s=new StaticBlockk();
        s.disp();
        
        
    }

    static{
        System.out.println("Static block 2");
        }
        static{
            System.out.println("Static block 3 "+ b);
            }
    
}


