import java.util.Scanner;
class Even{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in)
		int a;
		System.out.println("Enter input");
		a=sc.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}