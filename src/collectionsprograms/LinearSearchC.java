package collectionsprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LinearSearchC {

	public static void main(String[] args) {
		linearSearch();
	}

	private static void linearSearch() {
		ArrayList list = new ArrayList(Arrays.asList(1,5,6,8,3,2));
		for(int i=0;i<list.size();i++) {
			if((int)list.get(i)== 8) {
				System.out.println("ele found at index "+ i);
				return;
			}
		}
		System.out.println("ele not found");
			
	}

}
