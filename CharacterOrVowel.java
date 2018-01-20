import java.util.Scanner;
class CharacterOrVowel{
 public void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.pritln("Enter Character:");
	char a=sc.nextChar().charAt(0);
	System.out.println(a);
	if((a>='a' && a<='z')||(a>='A' && a<='Z'))
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
 }
}