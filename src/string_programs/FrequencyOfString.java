package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfString {

	public static void main(String[] args) {
		String str = "hello hi hi hello hello bye bye jai";
		frequency(str);
	}

	private static void frequency(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);			
		}
		
		for(Entry<String, Integer> obj : map.entrySet()) {
			System.out.println(obj.getKey() + " "+ obj.getValue());
		}
		
	}

}
