package Models;

import java.util.Scanner;

public class MetodaDjeljenje {

//	public static int divide (int a, int b) {
//		if (b == 0) {
//			throw new ArithmeticException("Not Zero");
//		}
//		
//		return a / b;
//		
//	}
	
	public static void main(String[] args) {
		
//		try{
//		System.out.println(divide (2, 0));
//		
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Nije moguce");
//		} catch (InputMismatchException e1) {
//			System.out.println("Dijeljenje nije proslo");
//		}
//		System.out.println("Ovo je kraj programa");

		
		
		
		Scanner in = new Scanner (System.in);
		String a;

		System.out.println("Unesite nesto");
		a = in.nextLine();
		
		String ab = a.substring(0,a.lastIndexOf("+"));
		String ba = a.substring(a.lastIndexOf("+")+1,  a.length());
		
		int b = Integer.parseInt(ab);
		int c = Integer.parseInt(ba);
		

		

		
		in.close();
		}
		
	}
