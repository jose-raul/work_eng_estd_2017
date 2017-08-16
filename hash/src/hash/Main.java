package hash;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String s = "ABCDDBBCCABB";
		Map<Character, Integer> map = new HashMap<>();
	
		char[] chars = s.toCharArray();
		
		for (char c : chars) {
			if (map.containsKey(c)) {
				Integer aux = map.get(c);
				map.put(c, aux + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
