package ExtraProgs;

public class Trisum {
		public static void main(String[] args) {
			int arr[]= {1,3,2,5,4,6,8,3,9};
			int sum=13;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					for (int k = 0; k < arr.length; k++) {
						if(i!=j && j!=k && i!=k &&(arr[i]+arr[j]+arr[k])==sum)
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
}
