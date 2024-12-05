package string_programs;

public class StringToArrayWithoutSplit {

	public static void main(String[] args) {
		toStringArray();
	}

	private static void toStringArray() {
		String str = "hello this is manu";
		String[] arr = new String[4]; 
		String temp = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ') {
				temp += ch;
			}
			else {
			arr[j++] = temp;
			temp = "";
		 }
		}
		arr[j] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
