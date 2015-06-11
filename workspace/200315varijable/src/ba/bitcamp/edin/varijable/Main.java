package ba.bitcamp.edin.varijable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		int num2 = 15;
		int multiplication = 3 * 9;
		double division = num / num2;

		int integerDivision = (int) (num / 2.0);

		String message = "Broj " + "je: ";

		char character = 65 + 1;
		
		int crazyNumber = 3;
		crazyNumber += crazyNumber++ + ++crazyNumber;
		
		System.out.println ("Crazy number: " + crazyNumber);

		System.out.println(message+division);
		System.out.println (character);
		
		System.out.println (integerDivision);
		
		boolean s = 2 == 3;
		System.out.println ("Boolean:" + s);
	}

}