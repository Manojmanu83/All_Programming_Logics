package ProgramsOnRecursion;

public class Fibbonacci {

	public static void main(String[] args) {
		int no = 6;
		System.out.println(fib(no));
	}

	private static int fib(int no) {
		if(no == 0)
			return 0;
		if(no == 1 || no == 2)
			return 1;
		else 
			return fib(no-1) + fib(no-2);
	}

}
