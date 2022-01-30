import java.io.FileInputStream;

public class CompileTime {
    public static void main(String[] args) {
        FileInputStream fis=new FileInputStream("d:abcd.txt");  //compile time checked exception
        
    }
    
}
