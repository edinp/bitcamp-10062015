import java.util.Scanner;


public class Day7part9 {

	public static void main(String[] args) {
		
		
		// ispisi sve proste brojeve manje od datog broja
		
		int endInterval = 10;
		
		for(int j = 1; j<=endInterval; j++){
		
			int num = j;
			boolean isPrime = true;
		
				for (int i = 2; i < num; i++){
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
		
				if (isPrime == true) {
					System.out.println(num);
				}
			}
		
		// ispisi sve proste brojeve manje od datog broja
		/*Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		//for (int j = 1; j < num; j++){
		boolean isPrime = true;
		
		for(int i = 2; i<num; i++){
			if(num%i==0){
			
				isPrime=false;
			}
		//}
		if (isPrime==true){
			System.out.println(num);
		}
		}*/
			
			


	}

}
