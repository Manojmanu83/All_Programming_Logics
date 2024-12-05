package string_programs;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		panagram();
	}

	private static void panagram() {
		String str = "the quick brown fox jumps upon right over the lazy dog";
		HashSet set = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch !=' ')
				set.add(ch);
		}
		System.out.println(set.size() == 26?"panagram":"not a panagram"); 
			
		
	}

}
