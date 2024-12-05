package TwoDArrayProgs;

public class SymmetricArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, 
						{ 2, 4, 5 }, 
						{ 3, 5, 6} };
		if (symmetric(arr)) {
			System.out.println("symmetric");
		} else
			System.out.println("not symmetric");
	}

	private static boolean symmetric(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i])
					return false;
			}
		}
		return true;
	}
}
