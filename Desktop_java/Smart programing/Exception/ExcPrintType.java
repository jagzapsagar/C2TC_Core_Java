package Exception;

public class ExcPrintType {
    public static void main(String[] args) {
        int a=10,b=20,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());

        }
    }
    
}
