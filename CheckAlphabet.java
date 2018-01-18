import java.util.Scanner;
class CheckAlphabet{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 char a;
 a=sc.nextChar();
 if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
  System.out.println("Alphabet");
 else
  Sytem.out.println("Not a alphabet");
 }
}