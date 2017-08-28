package tree;

public class Rec {

	public static void main(String[] args) {
		System.out.println(somar(1));
	}
	
	public static int somar(int n) {
		if(n == 10){
			return 10;
		}
		System.out.println(n);
		return somar(++n);
	}
	
}
