package string_programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "raie";
		String b = "care";
		
		if(a.length()==b.length()) {
			char ch1[] = a.toCharArray();
			char ch2[] = b.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagaram");
			}
			else
				System.out.println("not ana");
			
		}
		else {
			System.out.println("not ana");
		}
	}

}
