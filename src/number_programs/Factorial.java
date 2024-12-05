package number_programs;

public class Factorial {

	public static void main(String[] args) {
		int no = 4;
		int fact = 1;
		for(int i = no;i>=1;i--) {
			fact *= i;
		}
		System.out.println(fact);
		
//		fact();
		 
	}

	public static int fact(int no) {
		int fact = 1;
		for(int i = no;i>=1;i--) {
			fact *= i;
		}
//		System.out.println(fact);
		return fact;
		
	}
	 

}
