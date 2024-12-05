package string_programs;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String s = "jaijaijaikumar";
		frequency(s);
	}

	private static void frequency(String s) {
		int arr[] = new int[123];
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				System.out.println((char)i + " -> "+ arr[i]);
		}
	}

}
