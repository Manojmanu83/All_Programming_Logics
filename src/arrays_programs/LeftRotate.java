package arrays_programs;

public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int j = 0;
		int k = 7;
		k = k%arr.length;
		for(int i=0;i<arr.length;i++) {
			if(k<arr.length) {
				System.out.print(arr[k++]+" ");
			}
			else {
				System.out.print(arr[j++]+" ");
			}
		}
	}
}
