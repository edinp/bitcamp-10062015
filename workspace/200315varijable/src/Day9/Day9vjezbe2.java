package Day9;

import java.util.Scanner;

public class Day9vjezbe2 {

	public static void main(String[] args) {
		

		TextIO.readFile("result.txt");
		String prethodni = TextIO.getln();
		System.out.println(prethodni);
//		TextIO.writeStandardOutput();
		int umnozak;
		int counter = 0;
		int umnozak1;
		int counter1 = 0;
		
		
		Scanner broj = new Scanner (System.in);
		
		System.out.println();
		System.out.print("Vase ime: ");
		String ime = broj.nextLine();
		
		String IME = ime.toUpperCase();
		
		System.out.println();
		System.out.println("LEVEL 1");
		System.out.println();
		
		
		
		for (int i = 1; i <= 5; i++){
		
			
		int a = (int)(Math.random() * 10 + 1);
		int b = (int)(Math.random() * 10 + 1);
		
		System.out.print(a + " * ");
		System.out.print(b + " = ");
		
		
		umnozak = broj.nextInt();
		
		
		if (umnozak == a*b){
			
			counter++;
		}

		
		}
		
		System.out.println("Broj tacnih odgovora (Level 1): " + counter);
		System.out.println();
		
			
	
		if (counter>3){
		
		System.out.println("LEVEL 2");
		System.out.println();	
			
		
			for (int j = 1; j <= 5; j++){
				
				
				int c = (int)(Math.random() * 10 + 10);
				int d = (int)(Math.random() * 10 + 10);
				
				System.out.print(c + " * ");
				System.out.print(d + " = ");
				
				
				umnozak1 = broj.nextInt();
				
				
				if (umnozak1 == c*d){
					
					counter1++;
				}

				
				}
			
			System.out.println("Broj tacnih odgovora (Level 2): " + counter1*2);
			System.out.println();
			System.out.println("Ukupan broj bodova za " + IME + " je: " + (counter+counter1*2));
			
		} else if (counter==3) {
			System.out.println("Solidan si, haj pokusaj ponovo.");
		} else if (counter<3) {
			System.out.println("Vrati se u skolu.");
		}
		
		
		TextIO.writeFile("result.txt");
		TextIO.putln("Prethodni igrac  " + IME + "  osvojio je " + (counter+counter1*2) + " bodova.");

		broj.close();
	
	}

}
