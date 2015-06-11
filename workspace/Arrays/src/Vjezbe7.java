import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Vjezbe7 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		System.out.println("Unesite duzinu niza N: ");
		int duzina = in.nextInt();
		
		System.out.println("Koliki broj unosa zelite?");
		int unos = in.nextInt();
				
//		int[] index = new int[duzina];
		int[] value = new int[duzina];
		
		for (int i = 0; i < unos; i++) {
			System.out.println("Index: ");
				int ind = in.nextInt();
			System.out.println("Value: ");
				int val = in.nextInt();
			value[i] = val;
		} 
		
		//System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(value));
		


		
		
		
		in.close();
	}
}