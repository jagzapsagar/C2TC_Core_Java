import java.util.*;
public class StringsOne {
    public static void main(String[] args) {
        
    
    String FName="Sagar";
    String LName="Jagzapp";
    String FullName=FName +" " + LName; //Conacat 2 strings  
    
    System.out.println(FullName);   //print cancat string
    System.out.println(FullName.length());// print length of string

    for(int i=0;i<FullName.length();i++){
        System.out.print(FullName.charAt(i));  //print echa charactor by char
    
    }
    System.out.println();
    if(FName.compareTo(LName) == 0){  //compare 2 strings
        System.out.println("Equal");
    }
    else{
        System.out.println("Not Equal"); 
    }
}
}
