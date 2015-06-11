package Models;

public class Auto {

	private String carModel;
	private int firstRegistration;
	private String fuel;
	private int doorNumb;
	private boolean anyAccidents;
	private String color;
	
	
	public Auto (String m, int r, String f, int d, boolean a, String c) {
		carModel = m;
		firstRegistration = r;
		fuel = f;
		doorNumb = d;
		anyAccidents = a;
		color = c;
		
	}
	
	public String toString() {
		String car = "";
		car = car + "Car Model: " + carModel + "\n";
		car = car + "First Registration: " + firstRegistration + "\n";
		car = car + "Fuel: " + fuel + "\n";
		car = car + "Door number: " + doorNumb + "\n";
		car = car + "Any Accidents: " + anyAccidents + "\n";
		car = car + "Color: " + color;
		
		return car;
		
	}
	
}
