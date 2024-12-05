package string_programs;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Amma";
//		palindrome(str);
		palindromeWithoutEquals(str);
	}

	private static void palindromeWithoutEquals(String str) {
		int i =0;
		int j= str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}
			else {
				System.out.println("not a palindrome");
				return;
			}
		}
		System.out.println("palindrome");
	}

	private static void palindrome(String str) {
		String rev = "";
		for (int i = str.length()-1; i>=0 ; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev.equalsIgnoreCase(str) ? "palindrome" : "not a palindrome");
	}

}
