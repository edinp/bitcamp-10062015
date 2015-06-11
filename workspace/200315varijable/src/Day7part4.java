import java.util.Scanner;


public class Day7part4 {

	public static void main(String[] args) {

		// program koji izbacuje parne brojeve
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj");
		int num = in.nextInt();
		
		for (int i = 1; i<=num; i++)
			if(i % 2 == 0) {
				System.out.println(i);
			}

	}

}
