package collectionsprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		findUnique();
	}

	private static void findUnique() {
		ArrayList a = new ArrayList(Arrays.asList("hello","hi","hello","hi","bye","manu"));
		for(int i=0;i<a.size();i++) {
			boolean flag = true;
			for(int j=0;j<a.size();j++) {
				if(i!=j&&a.get(i)==a.get(j)){
					flag= false;
					break;
				}
			}
			if(flag) {
				System.out.print(a.get(i)+" ");
			}
		}
		
	}

}
