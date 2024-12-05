package collectionsprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
			ArrayList arr = new ArrayList(Arrays.asList(2,5,1,4,3));
			for(int i =0;i<arr.size();i++) {
				for(int j=0;j<arr.size()-1-i;j++) {
					if((int)arr.get(j)>(int)arr.get(j+1)) {
						int temp = (int)arr.get(j);
						arr.set(j, arr.get(j+1));
						arr.set(j+1, temp);
					}
				}
			}
			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i)+" ");
			}
		}

}
