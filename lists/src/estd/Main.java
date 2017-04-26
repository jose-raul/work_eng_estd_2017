package estd;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new SArrayList<>();
		list.add("A");
		list.add("B");
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}
