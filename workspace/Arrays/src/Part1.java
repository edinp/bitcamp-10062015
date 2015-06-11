import java.util.Scanner;


public class Part1 {

	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Unesite max broj brojeva za unos:");
		int maxBroj = in.nextInt();
		
		System.out.println("Unesite max " + maxBroj + " brojeva, 0 za prekid");
		
		int[] brojevi = new int[maxBroj];
		
		for(int i = 0; i < brojevi.length; i++) {
			int br = in.nextInt();
			if (br>0){
				brojevi[i] = br; // brojevi od index postaje broj
			} else {
				break;
			}
			
		}
		int max = -1;
		
		for(int i = 0; i < brojevi.length; i++) {
			int elementNiza = brojevi[i];
			if (elementNiza > max) {
				max = elementNiza;
			}
		}
		
		System.out.println(max);
		
		
	
		
		
		
		
		in.close();
				
		
	}
	
	
}
