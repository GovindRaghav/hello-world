import java.util.Scanner;
class Factorial{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number:");
		n=sc.nextLong();
		int i=n;
		long factorl=1;
		while(i>0)
		{
			factorl=factorl*i;
			i--;
		}
		System.out.println("Factorial of"+n+"is="+factorl);
	}
}