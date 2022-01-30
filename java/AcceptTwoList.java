import java.util.*;
public class AcceptTwoList {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                

                //Rrray list One
                System.out.println("Enter Size");
                int size=sc.nextInt();
                int no[]=new int[size];
                int even[]=new int[size];
                int Odd[]=new int[size];
                System.out.println("What is the inpute 1: ");
                for(int i=0;i<no.length;i++){
                    no[i]=sc.nextInt();
                }

                
                int noT[]=new int[size];
                System.out.println("What is the inpute 2: ");
                for(int j=0;j<noT.length;j++){
                    noT[j]=sc.nextInt();
                }


                
                //for even number
                System.out.print("Even: ");
                for(int i=0;i<no.length;i++){

                     if(no[i]%2==0){
                            
                            //even[i]=no[i];
                            System.out.print(no[i] +" ");
                        }   
                    }
                    for(int j=0;j<noT.length;j++){

                        if(noT[j]%2==0){
                               
                               //even[i]=no[i];
                               System.out.print(noT[j] +" ");
                           }
   
                          
                       }

                       //For Odd Number
                       System.out.println();
                       System.out.print("Odd: ");
                for(int i=0;i<no.length;i++){

                     if(no[i]%2!=0){
                            
                            //even[i]=no[i];
                            System.out.print(no[i] +" ");
                        }

                       
                    }
                    for(int j=0;j<noT.length;j++){

                        if(noT[j]%2!=0){
                               
                               //even[i]=no[i];
                               System.out.print(noT[j] +" ");
                           }
   
                          
                       }
                   
                }
            }
            
        