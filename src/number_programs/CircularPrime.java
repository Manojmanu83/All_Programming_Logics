package number_programs;

public class CircularPrime {

	public static void main(String[] args) {
		int no = 197;
		if(circularPrime(String.valueOf(no)))
			System.out.println("circular prime");
		else
			System.out.println("Not circular prime");
	}

	private static boolean circularPrime(String str) {
		for(int i=0;i<str.length();i++) {
			if(!prime(Integer.parseInt(str))) {
				return false;
			}
			else {
				str = str.substring(1) + str.charAt(0);
			}
		}
		return true;
	}
	
	public static boolean prime(int no) {
		for (int i = 2; i < no; i++) {
			if(no%i ==0)
				return false;
		}
		return true;
	}

}
