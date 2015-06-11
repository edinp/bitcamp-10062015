package Models;

class Drink {

	private String name;
	private boolean isSoda;
	private int expirationYear;
	private String color;
	
	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Is soda: " + isSoda + "\n";
		s = s + "Expiration Year: " + expirationYear + "\n";
		s = s + "Color: " + color;
		
		return s;
	}
	
	
	
}
