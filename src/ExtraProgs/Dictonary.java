package ExtraProgs;

public class Dictonary {

	public static void main(String[] args) {
		String s = "deep";
		String c = "";
		
		for(int i=0;i<s.length();i++) {
			for(int j=97; j<=122;j++) {
				if(s.charAt(i) == j) {
					System.out.println(c +(char)j);
					c += (char)j;
					break;
				}
				else 
					System.out.println(c+ (char)j);
			}
			
		}
	}

}
