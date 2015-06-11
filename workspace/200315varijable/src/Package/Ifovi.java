package Package;

public class Ifovi {

	public static void main(String[] args) {

		// PRVI ZADATAK
		/*
		 * int a = 5; if (a>0) { System.out.println("Pozitivan"); }else{
		 * System.out.println("Negativan"); }
		 */

		// DRUGI ZADATAK
		/*
		 * int a = 3; int b = 2; boolean djeljivo = a%b==0; if (djeljivo) {
		 * System.out.println("Djeljiv"); } else {
		 * System.out.println("Nije djeljiv"); }
		 */

		// TRECI ZADATAK
		/*int a = 1;
		int b = 4;
		int c = 3;
		if (a > b && a > c) {
			System.out.println("A je najveci");
		}else if (b > a && b > c){
			System.out.println("B je najveci");
		}else if (c > a && c > b)
			System.out.println("C je najveci");
		}*/

		// CETVRTI ZADATAK
		/*int a = 30;
		if (a > 0 && a < 25) {
			System.out.println("Broj je izmedju 0 i 25");
		} else if (a > 25 && a < 50) {
			System.out.println("Broj je izmedju 25 i 50");
		} else if (a > 50) {
			System.out.println("Broj je veci od 50");
		}*/
		
		// PETI ZADATAK
		/*int dan31 = ;
		int danasnjiDan = 22;
		int danasnjiMjesec = 05;
		int trazeniDan = 31;
		int trazeniMjesec = 12;
		if (trazeniMjesec == 2 && trazeniDan > 28) {
			System.out.println("Nepostojeci datum");
		} else if (danasnjiMjesec*30+danasnjiDan > trazeniMjesec*30+trazeniDan) {
			System.out.println("Rodjendan je prosao");
		} else if (danasnjiMjesec*30+danasnjiDan < trazeniMjesec*30+trazeniDan && trazeniMjesec*30+trazeniDan < 365) {
			System.out.println("Rodjendan ce tek da bude u ovoj godini");
		}*/
		
		
		// SESTI ZADATAK
		/*int a = 1800;
		int b = 4;
		int c = 100;
		int d = 400;
		boolean djeljivo = a%b==0;
		boolean djeljivo2 = a%c!=0 || a%d==0;
		if(djeljivo && djeljivo2) {
			System.out.println("Leap year");
		}else{
			System.out.println("Not a Leap Year");
		}*/
		
		
		// SEDMI ZADATAK
		/*int a = 4444;
		int godina = 1600;
		int feb28 = 28;
		int jan = 31;
		boolean feb = godina%4==0 && (godina%100!=0 || godina%400==0);
		if(feb) {
			System.out.println("leap year");
		}*/
		
		int dan = 15;
		int mjesec = 12;
		int dan1 = ++dan;
		if(dan1>31 && mjesec<=12){
			System.out.println("1" + "." + ++mjesec + ".");
		}else if(dan1>31){
			System.out.println("Sutra je: " + "1." + ++mjesec + ".");
		}

		
		/*int jan = 31;
		int feb = 28;
		int mar = 31;
		int apr = 30;
		int maj = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;
		int sep = 30;
		int oct = 31;
		int nov = 30;
		int dec = 31;
		boolean a1 = dan%31==0;
		boolean a2 = dan%31!=0;
		if (a1){
		}
		int trenutnidan = mjesec*30+dan;*/
		
		
		
		
	}
}