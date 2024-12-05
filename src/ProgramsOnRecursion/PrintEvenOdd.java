package ProgramsOnRecursion;

public class PrintEvenOdd {

	public static void main(String[] args) {
		int no = 1;
		int no1 = 10;
		printEven(no);
		System.out.println("********");
		printOdd(no1);

	}

	private static void printOdd(int no) {
		if (no >= 1) {
			if (no % 2 == 1) {
				System.out.println(no);
			}
			printOdd(no - 1);
		}
	}

	private static void printEven(int no) {
		if (no <= 10) {
			if (no % 2 == 0) {
				System.out.println(no);
			}
			printEven(no + 1);
		}
	}

}
