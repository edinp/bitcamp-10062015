import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Part3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Unesite max broj brojeva (min 5):");
		int maxBroj = in.nextInt();
		maxBroj = Math.max(maxBroj, 5);
//		System.out.println("Unesite max " + maxBroj + " brojeva, 0 za prekid");
		
		
		int poz = 0;
		int[] brojevi = new int[maxBroj];
		while(true){
			int br = in.nextInt();
			if(br>=0){
				if(poz<brojevi.length){
					brojevi[poz]=br;
					poz++;
				} else {
					for(int i = 1; i < brojevi.length; i++){
						brojevi[i-1] = brojevi[i];
					}
					brojevi[brojevi.length-1] = br;
				}
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
		System.out.println("Najveci broj: " + max);
		System.out.println(Arrays.toString(brojevi));
		
		
		in.close();
	}

}
