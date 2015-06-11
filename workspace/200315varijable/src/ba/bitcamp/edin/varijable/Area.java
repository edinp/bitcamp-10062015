package ba.bitcamp.edin.varijable;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sideA = 5;
		int sideB = 8;
		int numSides = 2;
		int bothSidesA = sideA * numSides;
		int bothSidesB = sideB * numSides;
		int volumeRect = bothSidesA + bothSidesB;
		
		System.out.println ("Volume of rectangle: " + volumeRect);
		System.out.println ("Area of rectangle: " + sideA*sideB);
		
		int diametar = 5;
		float radius = 2.5F;
		float Pi = 3.14F;
		float volumeCircle = diametar * Pi;
		float areaCircle = radius*radius*Pi;
		
		//int hex = 0xFF5;
		
		//System.out.println (hex);
		
		double longnumber = 10.0 / 3;
		
		System.out.println ("Volume of circle: " + volumeCircle);
		
		System.out.println ("Area of circle: " + areaCircle);
		
		int num1 = 3, num2 = 4;
		System.out.printf("Ovdje je broj1: %d i ovdje je broj2: %d\n Double: %.2f", num1, num2, longnumber);
	
	
	}

}
