package velha;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("a", 2);
		map.put("b", 3);
		
		map.entrySet().stream().forEach(System.out::println);
	}
	
}
