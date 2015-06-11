import java.util.Scanner;


public class Day7part2 {

	public static void main(String[] args) {
		
		// faktorijel zadatak
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		int faktorijel = 1;
		
		for (int i = 1; i<=num; i++){
		faktorijel*=i;}
		System.out.println(faktorijel);

	}

}
