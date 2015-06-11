import java.util.Scanner;


public class Day7part3 {

	public static void main(String[] args) {
		
		// program koji izbacuje djelioce datog broja
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unos:");
		int num = in.nextInt();
		
		for(int div = 1; div<=num; div++)
			if(num % div == 0) {
			System.out.println(div);
			}
		
		
		
		// varijanta 2
		int a = 27;
		for (int i = 1; i<=a; i++){
			if (a%i==0){
				System.out.println(i);
				}
			}
		
		

	}

}
