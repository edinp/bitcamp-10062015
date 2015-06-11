package Models;

import java.util.Scanner;

public class Zadaca10naVjezbama {

	
	/*
	 *  5. ZADATAK
	 */
	
//	public static int getNextOddNumber(int num) {
//		if (num % 2 == 0) {
//			return num +1;
//			
//		} else {
//			return num +2;
//		}
//		}
//		
//	
//	public static double getAreaOfCircle(int diametar) {
//			return (diametar * diametar / 4) *Math.PI;

//
//	}			
//	
//	public static boolean isInRange(int start, int finish, int n) {
//		if (start < n && n< finish) {
//			return true;
//		} else {
//			return false;
//		}
//		// ili    return start < n && n < finish;
//	}
//	
//	
	public static void main(String[] args) {
//
//		System.out.println(getNextOddNumber(2));
//		System.out.println(getAreaOfCircle(10));
//		System.out.println(isInRange(1, 5, 2));
//		
//	}
	
		
		
		
		/*
		 *   2. ZADATAK
		 */
		
		
//		String zagrade = "{{{{}}}}";
//		
//		int openBrackets = 0;
//		
//		for (int i = 0; i < zagrade.length(); i++) {
//			if (zagrade.charAt(i) == '{') {
//				openBrackets++;
//			} else {
//				openBrackets--;
//			}
//			
//			
//			if (openBrackets < 0) {
//				System.out.println(false);
//				System.exit(0);
//			}
//		}
//		if (openBrackets == 0) {
//			System.out.println(true);
//		}
		
		
		
		
		/**
		 * 1. ZADATAK / ne radi
		 */
		
//		String bin = "11010011";
//		int n = 8;
//		
//		if (!(bin.charAt(0) == '1' && bin.length() == n)) {
//			System.out.println(bin);
//			System.exit(0);
//		}
//		
//		
//		String first = "";
//		for (int i = 0; i < bin.length(); i++) {
//			if (i == '1') {
//				first += "0";
//			} else {
//				first += "1";
//			}
//		}
//		
//		int base10 = 0;
//		for (int i = 0; i < first.length(); i++) {
//			if (i == '1') {
//				base10 += (int) Math.pow(2, first.length() - 1 - i);
//			}
//		}
//	
//		base10++;
//		
//		String second = "";
//		while (base10 != 0) {
//			if (base10 % 2 == 0) {
//				second = "0" + second;
//			} else {
//				second = "1" + second;
//			}
//			base10 /= 2;
//		}
//		
//		System.out.println(first);
//		System.out.println(base10);
//		System.out.println(second);
		
		
		
		
		
		/*
		 *    8. ZADATAK
		 */
		
//		Scanner address = new Scanner(System.in);
		
		
		// cita web stranicu , baznu
		
//		String url = address.next();
//		String nova = "";
//		
//		
//		for (int i = 0; i < url.length(); i++) {
//			if (url.charAt(i) == '/') {
//				i+=2;
//				while (url.charAt(i) != '/'){
//				nova += url.charAt(i);
//				i++;
//				} 
//					
//				
//			} 
//		} System.out.println(nova);
		
		
		// cita adresu na kraju 
		
//		String url = address.next();
//		String nova = "";
//		int counter = 0;
//		
//		for (int i = 0; i < url.length(); i++) {
//			if (url.charAt(i) == '/') {
//				counter++;
//			}
//			else if (counter == 3) {
//				nova += url.charAt(i);
//			}
//		} System.out.println(nova);
		
		
		
		
//		address.close();
		
		
		
		
		
//		7. ZADATAK
		
		
//		int n = 14;
//		int k = 5;
//		int counter = 0;
//		int reducedN = n;
//		
//		while (n%2 == 0) 
//			n=n/2;
//		
//		while (reducedN > k) {
//			reducedN = n;
//			while (reducedN % 2 == 0) {
//				reducedN /= 2;
//			}
//			
//			if (reducedN > k) {
//				n++;
//				counter++;
//			}
//		}
		
//		if (k >= n) {
//			System.out.println("Moze sve utovarit");
//		} else if (k < n){
//			
//			do { 
//				n++;
//				n = n/2;
//			} while (n%2 == 0);
//			
//			System.out.println("Treba kupit " + n + " kontejnera");
//		}
			
		
		// 3. ZADATAK, vec poslat uradjen u nedjelju
		
//		Scanner broj = new Scanner(System.in);
//		System.out.println("Unesite neki broj: ");
//		long num = broj.nextInt();
//		long n = 1;
//		long digits;
//		
//		
//		for (int i = 1; i <= num; i++) {
//			n=i*n;
//		}
//		System.out.println("Faktorijel: " + n);
//	
//		while (n%10==0) {
//			n=n/10;
//		} System.out.println("Faktorijel bez nula: " + n);
//		
//		digits = n%100;
//		System.out.println("Zadnje dvije cifre: " + digits);
		
		
		
		TextIO.readFile("src/models/encodedFile.in");
		int firstLine = TextIO.getInt();
		
		
		int a = 33;
		char x = (char)a;
		System.out.println(x);
		
		
		System.out.println(firstLine);
		
		for (int i = 0; i <= firstLine; i++) {
			String secondLine = TextIO.getln();
			
			System.out.println(secondLine);
		}
		
		
	}
}
