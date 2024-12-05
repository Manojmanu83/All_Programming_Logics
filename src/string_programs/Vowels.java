package string_programs;

public class Vowels {

	public static void main(String[] args) {
	String val = "vowels";
		printvowels(val);
		printconsonants(val);
	}

	private static void printconsonants(String val) {
		int count =0;
		for(int i=0;i<val.length();i++) {
			char ch = val.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				System.out.print(ch +" ");
				count++;
			}
		}
		System.out.println(" number of consonants  "+ count);
	}

	private static void printvowels(String val) {
		int count=0;
		for(int i=0;i<val.length();i++) {
			char ch = val.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch +" ");
				count++;
			}
		}
		System.out.println(" number of vowels "+ count);
	}

	

}
