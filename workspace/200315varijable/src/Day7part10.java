
public class Day7part10 {

	public static void main(String[] args) {

		// sabiranje svih cifara u broju

		
		int num = 123456;
		int suma = 0;
		while (num>0){
			int digit = num % 10;
			suma+=digit;
			num/=10;
		}
		
		//for(num>0; n%10; )  NIJE URADJENO PREKO FOR-A
		
		System.out.println(suma);

		
		
		
	}

}
