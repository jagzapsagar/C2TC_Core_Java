import java.util.Scanner;

class abc
{
	
	public static void main(String args[])
	{
		int i,fact =1;
		System.out.println("Enter A no");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fact is :"+fact);
		
	}
}
