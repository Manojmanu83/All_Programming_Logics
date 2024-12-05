package number_programs;

public class BubbleSortS {

	public static void main(String[] args) {
			String arr[] = {"hello","hi","abb","Zaa"};
			for(int i =0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j].compareToIgnoreCase(arr[j+1])>0) {
						String temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
