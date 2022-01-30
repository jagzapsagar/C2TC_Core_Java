import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows");
        int row=sc.nextInt();
        System.out.println("Enter Colums");
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        
        System.out.print("Enter data");
        System.out.println("");


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();

            }
        }
        //Output
        System.out.println("Here Is ur data");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
