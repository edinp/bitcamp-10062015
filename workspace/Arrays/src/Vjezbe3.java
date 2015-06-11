import java.util.Arrays;
import java.util.Scanner;


public class Vjezbe3 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite duzinu niza");
		int duzina = in.nextInt();
		int niz[] = new int[duzina];
		System.out.println("Unesite brojeve u vas niz: ");
		for(int i = 0; i < niz.length; i++) {
			niz[i] = in.nextInt();
		} 
		
		for (int vrijednost : niz) {
			System.out.println(vrijednost);
		}
		
		
		System.out.println(Arrays.toString(niz));
		
		in.close();

	}

}
