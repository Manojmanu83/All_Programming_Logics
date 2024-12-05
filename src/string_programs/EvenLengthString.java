package string_programs;

public class EvenLengthString {

	public static void main(String[] args) {
		evenLength();
	}

	private static void evenLength() {
		String str = "hello hi manu how are you";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			if(s.length()%2==0)
				System.out.print(s+" ");
		}
	}

}
