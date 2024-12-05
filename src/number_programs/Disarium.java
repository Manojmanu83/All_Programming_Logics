package number_programs;

public class Disarium {
	public static void main(String[] args) {

		int no = 176;
		int copy = no;
		int no1 = no;
		int count = 0;
		int sum = 0;

		while (no != 0) {
			int rem = no % 10;
			count++;
			no = no / 10;

		}
		while (no1 != 0) {
			int rem = no1 % 10;
			sum = sum + (int) Math.pow(rem, count);
			count--;
			no1 = no1 / 10;

		}
		System.out.println(copy == sum ? "disarium" + sum : "not a disarium " + sum);

	}

}
