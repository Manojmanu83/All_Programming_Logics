package Patterns.numbers;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int count = i;
			for(int j=1;j<=5;j++) {

//				if(i*j<10)
//					System.out.print("0");
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}

//1 2 3 4 5 
//2 3 4 5 6 
//3 4 5 6 7 
//4 5 6 7 8 
//5 6 7 8 9 