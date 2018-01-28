import java.util.Scanner;
class NumberReverse{
	public static void main(String args[])
	 {
	  Scanner sc=new Scanner(System.in);
	  long n;
	  String s=new String();
	  String rs=new String();
	  System.out.println("Enter Number");
      n=sc.nextLong();
	  s=Long.toString(n);
      int length=s.length();
      while(length>0)
	  {
		  rs=rs+s.charAt(length-1);
		  length=length-1;
	  }
	  long rn=Long.parseLong(rs);
   	  System.out.println(rn);
	}
} 