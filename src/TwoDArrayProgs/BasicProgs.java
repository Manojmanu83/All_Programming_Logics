package TwoDArrayProgs;

public class BasicProgs {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		printValues(arr);
		sumOfRow(arr);
	}

	private static void sumOfRow(int[][] arr) {
		System.out.println("Sum of Each Row");
		for (int row = 0; row < arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				System.out.print(arr[row][col]+" ");
			}
			System.out.print("-> "+sum+" \n");
		}
	}

	private static void printValues(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

	

}
