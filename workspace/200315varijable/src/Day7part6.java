
public class Day7part6 {

	public static void main(String[] args) {
		
		/*int a = 127;
		int brojDjeljenja = 0;
		
		
		for (int i = 1; i<=a; i++){
		if (a%i==0) {
		brojDjeljenja++;
			}
		} 
		
		if(brojDjeljenja>2){
			System.out.println("nije prost");
		} else {
			System.out.println("jeste prost");			}
*/
		
		int num = 15;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0){
				System.out.println("prost");
		} else {
			System.out.println("nije prost");
		}	break;
		} 
	}

}
