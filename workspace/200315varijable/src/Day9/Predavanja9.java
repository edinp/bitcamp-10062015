package Day9;

import java.util.Scanner;

public class Predavanja9 {

	public static void main(String[] args) {
		
		

		Scanner ime = new Scanner(System.in);
		
		String vaseIme;
		String vaseIME;
		String vasePrezime;
		int marke;
		int feninzi;
		double pare;
		
		System.out.print("Vase ime: ");
		vaseIme = ime.next();
		
		System.out.print("Vase prezime: ");
		vasePrezime = ime.next();
		
		System.out.print("Kolko imas maraka u dzepu? ");
		marke = ime.nextInt();
		
		System.out.print("Kolko imas feninga u dzemu? ");
		feninzi = ime.nextInt();
		
		pare = ((marke*100)+feninzi);
		
		vaseIME = vaseIme.toUpperCase();
		
		System.out.printf("Zdravo %s %s, daj sad tih %.2f feninga sto imas", vasePrezime, vaseIme, pare);

		/*Scanner bilosta = new Scanner(System.in);
		
		int feninzi;
		int marke;
		
		System.out.println("Koliko feninga: ");
		feninzi = bilosta.nextInt();
		System.out.println("Koliko maraka");
		marke = bilosta.nextInt();
		System.out.printf("Imate %d maraka i %d feninga", marke, feninzi);
		 */
		
		ime.close();
	}

}
