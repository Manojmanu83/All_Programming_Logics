package number_programs;

public class FetchDigits {

	public static void main(String[] args) {
		int no = 1234;
		int sum = 0;
		while(no!=0) {
			int rem = no%10;
			sum += rem; 
			no = no/10;
		}
		System.out.println(sum);
		armstrong();
	    strong();
	}

	private static void strong() {
		int no = 145;
		int cp = no;
		int sum = 0;
		while(no!=0) {
			int rem = no%10;
			sum = sum + Factorial.fact(rem);
			no = no/10;
		}
		System.out.println(sum == cp?"strong " + cp:"not strong");
	}

	private static void armstrong() {
		int no = 153;
		int no1 = no;
		int cp = no;
		int sum = 0;
		int count = 0;
		
		while(no!=0) {
			int rem = no%10;
			count++;
			no = no/10;
		}
		while(no1!=0) {
			int rem = no1%10;
			sum = sum + (int)Math.pow(rem, count);  
			no1 = no1/10;
		}
		System.out.println(sum);
		System.out.println(sum == cp?"Armstrong":"not Armostrong");
	}

}
