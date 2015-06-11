import java.util.Scanner;


public class Part2 {

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
				brojevi[poz]=br;
				poz++;
				if(poz==brojevi.length){
					poz=0;
					
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
		System.out.println(max);
		
		
		in.close();
	}

}
