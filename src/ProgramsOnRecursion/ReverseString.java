package ProgramsOnRecursion;

public class ReverseString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverse(s));
	}

	private static String reverse(String s) {
		if(s.isEmpty()) {
			return s;
		}
		else
			return reverse(s.substring(1)) + s.charAt(0);
	}

}
