package number_programs;

public class Fibbonacci {

	public static void main(String[] args) {
		int no =6;
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b+" ");
		for(int i=1;i<no;i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}

}
