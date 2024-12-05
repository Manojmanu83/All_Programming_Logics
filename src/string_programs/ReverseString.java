package string_programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "manva";
		reverse(str);
		reverseWithoutCharAt(str);
		reverseSentence();
	}

	private static void reverseSentence() {
		String str = "hell I am manu";
		String arr[] = str.split(" ");
		for (int i = arr.length-1; i>=0 ; i--) {
//			System.out.print(arr[i] + " ");
			reverse(arr[i]);
		}
	}

	private static void reverseWithoutCharAt(String str) {
		char[] arr = str.toCharArray();
		for (int i = arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	private static void reverse(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.print(rev + " ");
	}

}
