package number_programs;

public class IntegerToBinary {

	public static void main(String[] args) {
		toBianry();
		RangeToBinary();
	}

	private static void RangeToBinary() {
		int n = 10;
		for(int i=1;i<=n;i++) {
			String res = "";
			int no = i;
		while(no!=0) {
			int rem = no%2;
			res = rem + res;
			no = no/2;
		}
		System.out.println(i + " -> "+res);
	  }
		
	}

	private static void toBianry() {
		int n = 10;
		String res = "";
		while(n!=0) {
			int rem = n%2;
			res = rem + res;
			n = n/2;
		}
		System.out.println(res);
	}

}
