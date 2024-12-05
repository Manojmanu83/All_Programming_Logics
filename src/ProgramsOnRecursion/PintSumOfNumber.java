package ProgramsOnRecursion;

public class PintSumOfNumber {
	public static void main(String[] args) {
		int no = 4;
		System.out.println(sumOfNum(no));
	}

	private static int sumOfNum(int no) {
		if(no == 1)
			return no;
		else {
			return no + sumOfNum(no-1);
		}
	}
}
