package Day9;

import java.util.Scanner;

public class TextIOvjezbe {

	public static void main(String[] args) {

		//uredjena tablica mnozenja
		
		
		int tablica = 0;
		int a = 10;
		String crtica = "-";

		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				if (i==0 && j==0){
					System.out.print("*");
				} else if (i==0 && j==1){
					System.out.print(" |" + " 1 2 3 4 5");
				} else if (j==0 && i==1){
					System.out.print("-");
				} else if (j==0 && i>1){
					System.out.printf("%d  ", i);
				} else if (j==1 && i>1){
					System.out.println("|");
				} else if (i>1 && j>1)
				System.out.printf("%2d ", j*i);	
				
			}
			System.out.println();
		}
		
		
		
	}

}
