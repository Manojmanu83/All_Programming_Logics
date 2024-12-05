package string_programs;

public class RemoveAdjacent {

	public static void main(String[] args) {
		String str = "hey hey hello hello hi hi hi";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length-1;i++) {
			if(!arr[i].equals(arr[i+1])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[arr.length-1]);
	}

}
