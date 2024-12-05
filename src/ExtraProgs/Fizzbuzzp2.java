package ExtraProgs;

public class Fizzbuzzp2 {
	static String print(String no)
	{
		int n = Integer.parseInt(no);
		if(n%3==0 && n%5==0)
			return"FizzBuzz";
		else if(n%3==0)
			return"FizzFizz";
		else if(n%5==0)
			return"BuzzBuzz";
		else
			return no;
			}
	public static void main(String[] args) {
		for(int i=1;i<=15;i++) {
			System.out.println(print(String.valueOf(i)));
		}

	}

}
