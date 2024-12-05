package string_programs;

import java.util.Scanner;

public class Nearest_vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alpha");
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("you entered a vowel" +ch);
		}
		else if(ch>'a' && ch<'e')
			System.out.println("a,e");
		else if(ch>'e' && ch<'i')
			System.out.println("e,i");
		else if(ch>'i' && ch<'o')
			System.out.println("i,o");
		else if(ch>'o' && ch<'u')
			System.out.println("o,u");
		else if(ch>'u' && ch<='z')
		    System.out.println("u");

	}

}
