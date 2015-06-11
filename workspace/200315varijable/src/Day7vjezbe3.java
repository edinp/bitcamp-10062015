import java.util.Scanner;


public class Day7vjezbe3 {

	public static void main(String[] args) {
		
		// program koji trazi unos broja , sve dok ne unesemo paran broj
		
		Scanner in = new Scanner(System.in);
		int input = 0;
		
		do{
			System.out.println("unesi broj: ");
			input = in.nextInt();
			System.out.println("taj broj: " + input);
		} while(input%2!=0);
		
		in.close();
	}

}
