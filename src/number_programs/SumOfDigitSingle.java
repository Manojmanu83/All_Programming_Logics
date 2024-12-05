package number_programs;

public class SumOfDigitSingle {

	public static void main(String[] args) {
		int no = 13;
		while(no>9) {
			no = sum(no);
		}
		if (no == 1 || no == 7) {
			System.out.println("HAPPY NUMBER");
			
		}
		else {
			System.out.println("IT IS NOT HAPPY NUMBER");
		}
	}

	private static int sum(int no) {
		int sum = 0;
		while(no!=0) {
			int rem = no%10;
			sum += rem*rem; 
			no = no/10;
		}
		return sum;
	}

}
