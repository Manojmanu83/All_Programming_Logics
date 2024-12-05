package string_programs;

public class RepeatString {

	public static void main(String[] args) {
		String s = "aa2bb3cc2dd1";
		for(int i=0;i<s.length();i += 3) {
			String s1 = s.substring(i,i+2);
			char ch2 = s.charAt(i+2);
			printChars(s1,ch2);
		}
	}

	private static void printChars(String s1, char ch2) {
		int no = ch2-48;
		for(int i=0;i<no;i++) {
			System.out.print(s1);
		}
	}

}
