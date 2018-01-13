import java.util.Scanner;
class Greater
{
 public static void main(String args[])
 {
	 int a;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a input:");
	 a=sc.nextInt();
	 if(a>0)
		 System.out.println("Positive");
	 if(a<0)
		 System.out.println("Negative");
	 if(a==0)
		 System.out.println("Zero");
 }
}