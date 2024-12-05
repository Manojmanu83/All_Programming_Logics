package string_programs;

public class NextCharacter {

	public static void main(String[] args) {
		String str = "zZaAbdkei";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='z')
				System.out.print('A');
			if(ch=='Z')
				System.out.print('a');
			if(ch>='a' && ch<'z' || ch>='A' && ch<'Z')
				System.out.print((char)(ch+1));
		}
	}

}
