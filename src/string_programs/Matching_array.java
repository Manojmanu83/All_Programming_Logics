package string_programs;

public class Matching_array {

	public static void main(String[] args) {
//		String[] a = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
//		String[] b = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		char[] a1 = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
		char[] b = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String match = "";
		String str = "PROGRAMMING";
		System.out.println(str);
		for(int j = 0;j<str.length();j++)
		{
			for(int i=0;i<b.length;i++)
			{
				if(str.charAt(j) == (b[i]))
//					match += a[i];
					System.out.print((char) (a1[i]+32));
			}
		}
//		System.out.println(match.toLowerCase());
	}

}
