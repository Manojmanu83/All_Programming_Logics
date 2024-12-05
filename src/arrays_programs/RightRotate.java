package arrays_programs;

public class RightRotate {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = {1,2,3,4,5};
		k = k%arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				System.out.print(arr[arr.length-k+i]+" ");
				
			}
			else {
				System.out.print(arr[i-k]+" ");
			}
			
		}
	}

}
