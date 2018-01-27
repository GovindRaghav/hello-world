import java.util.Scanner;
class Reverse{
	public static void main(String args[])
	 {
	  Scanner sc=new Scanner(System.in);
	  String s=new String();
	  String rs=new String();
	  System.out.println("Enter String");
      s=sc.next();
      int length=s.length();
      while(length>0)
	  {
		  rs=rs+s.charAt(length-1);
		  length=length-1;
	  }
   	  System.out.println(rs);
	}
} 