import java.util.Scanner;


public class Day7vjezbe2 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		int input = 1;
		
		do{
			System.out.println("unesi broj: ");
			input = in.nextInt();
			System.out.println("taj broj: " + input);
		} while(input!=0);
		
		
		in.close();
	}

}
