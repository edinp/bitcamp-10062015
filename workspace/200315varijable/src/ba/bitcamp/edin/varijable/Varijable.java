package ba.bitcamp.edin.varijable;

public class Varijable {

	public static void main(String[] args) {
		/*int num = 2;
		boolean isWorking = true;
		char karakter = 'a';
		String s = "abc";
		double realniBroj = 3.14159;
		short num1 = 5;
		byte num2 = 5;
		float f = 2.5f;
		long num3 = 5;
		
		int broj1 = 5;
		int broj2 = 2;
		int rezultat = broj1 / broj2;
		System.out.println("Rezultat je: " + rezultat);*/
		
		
		/*double broj1 = 8;
		double broj2 = 4;
		double broj3 = 2;
		int rezultat = (broj1*broj2) / (broj2*(broj3+broj1));
		
		System.out.println("Rezultat je: " + rezultat);
		
		boolean rez = 5 != 2;
		System.out.println(rez);
		
		char character1 = 'e';
		char character2 = 'd';
		char character3 = 'i';
		char character4 = 'n';
	
		System.out.println("" + character1 + character2 + character3 + character4);

		byte V1=1, V2=1, V3=1;
		byte brojVarijabli = 3;
		double Vsvi = (double)(V1 + V2 + V3) / brojVarijabli;
		double Prosjek = Vsvi * 100;
		
		System.out.println("Prosjek je: " + Prosjek + "%");
		
		int num1 = 1;
		num1++;
		System.out.println(num1++);
		
		int a=2;
		int b=(a++)+(++a);
		System.out.println(b);
		
		int diametar = 6;
		int radius = 3;
		int heigh = 4;
		double Pi = 3.14;
		double volumeCircle = radius*radius*Pi;
		double areaCircle = 2 * radius * Pi;
		double volumeRoller = areaCircle * heigh;
		double areaRoller = volumeCircle * heigh;
		System.out.printf("Volume of Roller: %.2f\n Area of Roller: %.2f\n", volumeRoller, areaRoller);
		
		
		// MOZE LI SE PREZIVJETI STRUJA ?
		int voltage = 100;
		int resistance = 1200;
		float current = (float)voltage / resistance;
		//System.out.println("Current is: " + current + "[A]");
		
		boolean B = current < 0.1;
		System.out.printf("Alive? %b", B);
		
		
		// DIJELJENJE SA OSTATKOM
		int znak1 = -1;
		int znak2 = 2;
		int rez = znak1%znak2;
		System.out.println(rez);
		
		int hexa = 0xFACFC;
		System.out.println(hexa);*/
		
		
		int meters = 33000;
		int km = 33000 / 1000;
		int mm = 33000 * 1000;
		double ft = 33000 * 3.28084;
		double inch = 33000 * 39.3701;
		System.out.println(meters + "[m]");
		System.out.println(km + "[km]");
		System.out.println(mm + "[mm]");
		System.out.println(ft + "[ft]");
		
		System.out.println();
		
		int celsius = 12;
		double fahrenheit = 33.8;
		double transformator = celsius*1.8 + fahrenheit-1.8;
		System.out.println(transformator);
		
		int degree = 180;
		double radians = 0.0174532925;
		double transformator1 = degree*radians;
		System.out.println(transformator1);
	}

}