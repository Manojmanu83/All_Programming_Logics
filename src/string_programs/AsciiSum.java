package string_programs;

public class AsciiSum {

	public static void main(String[] args) {
		int sum =0;
		String str = "22pro22ram22in2g22";
		str = str.replaceAll("[^0-9]", " ");
		String[] s = str.split(" +");
		for(int i=0;i<s.length;i++) {
				sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}

}
