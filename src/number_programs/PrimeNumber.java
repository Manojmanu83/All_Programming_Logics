package number_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Eneter a Number");
//		int no = sc.nextInt();
//		boolean flag = true;
//		for (int i = 2; i < no;i++) {
//			if(no%i==0) {
//				flag = false;
//				break;
	
//			}
//		}
//		System.out.println(flag == true?"prime":"not Prime");
		rangeOfPrime();
		nextprime();
	}

	private static void nextprime() {
		int no = 17;
		for (int i = no+1; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i%j ==0) {
					flag = false;
					break;
					
				}
				if (flag) {
					System.out.println("the next prime is" + i);
					return;
					
				}
				
			}
		}
		
	}

	private static void rangeOfPrime() {
		int count =0;
		int k = 5;
		for(int i=1;i<=100;i++) {
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
				if(count==k) {
					System.out.print(i+" "+"count " + count);
					System.out.println();
					break;
				}	
			}
		}
		System.out.println();
		
		
	}
	

}
