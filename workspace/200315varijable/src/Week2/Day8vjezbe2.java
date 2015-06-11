package Week2;

import java.util.Scanner;

public class Day8vjezbe2 {

	public static void main(String[] args) {
		

		// za unesene brojeve dok se ne unese -1, izracunati prosjek
		
//		Scanner in = new Scanner(System.in);	
//		double suma = 0;
//		double counter = 0;
//		double prosjek = 0;
//		double num = 0;
//		
//		while (num != -1) {
//			System.out.println("Unesi broj: ");
//			num = in.nextDouble();
//			suma+=num;
//			counter++;
//			}
//			
//			prosjek = ++suma / --counter;
//			System.out.println(prosjek);
//	
//				
//		in.close();
		
		
		
		// 2. varijanta sa ifom
		
//		Scanner in = new Scanner(System.in);
//		
//		double input = 0;
//		double counter = 0;
//		double average = 0;
//		double sum = 0;
//		
//		while (input != -1) {
//		System.out.println("Unesi broj: ");
//		input = in.nextDouble();
//		if(input != -1){
//			sum+=input;
//			counter++;
//			}
//		}
//		average = sum / counter;
//		System.out.println(average);

		
		Scanner in = new Scanner(System.in);
		
		
		double num = 0;
		double num1 = 1;
	
		while (num != -1){
			System.out.println("Unesite broj: ");
			num = in.nextDouble();
			if (num > num1 && num != -1){
			}  System.out.println("Najveci broj je: " + num1);
		}
		

		in.close();
		
	}

}
