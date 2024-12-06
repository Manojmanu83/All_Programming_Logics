package Patterns.numbers;

public class Pattern1 {

	public static void main(String[] args) {
		int count = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
//				System.out.print(i+""+j+ " ");
				
				if(count<10)
					System.out.print("0");
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}

//11 12 13 14 15 
//21 22 23 24 25 
//31 32 33 34 35 
//41 42 43 44 45 
//51 52 53 54 55 

//01 02 03 04 05 
//06 07 08 09 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 

