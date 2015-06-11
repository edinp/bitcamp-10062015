import java.util.Scanner;


public class Vjezbe4 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);

		System.out.println("Koliko brojeva ces unijeti?");
		int niz = in.nextInt();
		int[] nizz = new int[niz];
		
		for(int i = 0; i < nizz.length; i++) {
			nizz[i] = in.nextInt();
		}
		
		System.out.println("Za koji broj zelis da znas koliko je puta unesen?");
		int trazeni = in.nextInt();
		int counter = 0;

		
		for (int i = 0; i < nizz.length; i++) {
			if (trazeni == nizz[i]){
				counter++;
			}
		}
		
		System.out.println("Trazeni broj unesen je " + counter + " puta.");
		
		
		
		
		in.close();

	}

}
