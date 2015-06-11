package Week2;

public class ZadatakIspisiDigit {

	public static void main(String[] args) {
		
		// ispisi trazeni digit unutar broja (FOR petlja)
//		int num = 123456;
//		int digit = 4;
//		for(int i = 1; digit>i; i++){
//			num=num/10;
//		}
//		num=num%10;
//		System.out.println(num);
		
		
		// isti zadatak na drugi nacin (WHILE petlja)
		int num = 123456;
		int digit = 4;
		int counter = 1;
		while (digit>counter){
			num=num/10;
			counter++;
		}
		num=num%10;
		System.out.println(num);
		
	}

}
