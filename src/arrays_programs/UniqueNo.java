package arrays_programs;

import java.util.HashSet;

public class UniqueNo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,1};
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
		removeDup(arr);
	}

	private static void removeDup(int[] arr) {
		HashSet set = new HashSet();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
	
	

}
