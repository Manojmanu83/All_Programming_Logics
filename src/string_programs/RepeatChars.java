package string_programs;

public class RepeatChars {

	public static void main(String[] args) {
		String s = "a2b3c2d1";
		for(int i=0;i<s.length();i += 2) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i+1);
			printChars(ch1,ch2);
		}
	}

	private static void printChars(char ch1, char ch2) {
		int no = ch2-48;
		for(int i=0;i<no;i++) {
			System.out.print(ch1);
		}
	}

}
