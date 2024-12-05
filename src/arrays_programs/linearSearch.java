package arrays_programs;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		linearSearch(arr,1);
	}

	private static void linearSearch(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==i) {
				System.out.println("ele found at index "+ j);
				return;
			}
		}
		System.out.println("ele not found");		
	}

}
