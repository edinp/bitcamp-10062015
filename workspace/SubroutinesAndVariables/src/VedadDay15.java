
public class VedadDay15 {

	public static String threeNPlusOne (int n) {
		
		String str = "";
		while (n>1) {
			if (n%2 == 1) {
				n=3*n+1;
			} else 
				n=n/2;
			str=str + n + ", ";
		} return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(threeNPlusOne(99));
	}
	
}
