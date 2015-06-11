package ba.bitcamp.edin.varijable;

public class Vjezbe2 {

	public static void main(String[] args) {
		
		
	// PRVI ZADACI :
	int bin1 = 0b111000110101;
	int bin2 = 0b10101010;
	int bin3 = 0b1011100011;
	int bin4 = 0b111111111;
	int bin5 = 0b11111111111;
	int bin6 = 0b1;
	int bin7 = 0b101010101010101;
	int bin8 = 0b10101010101010;
	int zad1 = bin1 + bin2;
	int zad2 = bin3 + bin4;
	int zad3 = bin5 + bin6;
	int zad4 = bin7*2;
	int zad5 = bin7 + bin8;
	System.out.println("Sabiranje zadatak 1: " + zad1);
	System.out.println("Sabiranje zadatak 2: " + zad2);
	System.out.println("Sabiranje zadatak 3: " + zad3);
	System.out.println("Sabiranje zadatak 4: " + zad4);
	System.out.println("Sabiranje zadatak 5: " + zad5);
	
	int bin11 = 0b111011011111;
	System.out.println("Provjera sabiranje zadatak 1: " + bin11);
	int bin22 = 0b10011100010;
	System.out.println("Provjera sabiranje zadatak 2: " + bin22);
	int bin33 = 0b100000000000;
	System.out.println("Provjera sabiranje zadatak 3: " + bin33);
	//System.out.println("Provjera sabiranje zadatak 4: " + bin44);
	//System.out.println("Provjera sabiranje zadatak 5: " + bin55);
	
	boolean zad1b = zad1 == bin11;
	System.out.println("Zadatak 1 tacan: " + zad1b);
	boolean zad2b = zad2 == bin22;
	System.out.println("Zadatak 2 tacan: " + zad2b);
	boolean zad3b = zad3 == bin33;
	System.out.println("Zadatak 3 tacan: " + zad3b);
	System.out.println();
	
	
	// DRUGI ZADACI :
	int bina1 = 0b111000110101;
	int bina2 = 0b10101010;
	int bina3 = 0b1011100011;
	int bina4 = 0b111111111;
	int bina5 = 0b11111111111;
	int bina6 = 0b1;
	int bina7 = 0b10000000000000;
	int bina8 = 0b101010101010101;
	int bina9 = 0b10101010101010;
	int zada1 = bina1 - bina2;
	int zada2 = bina3 - bina4;
	int zada3 = bina5 - bina6;
	int zada4 = bina7 - bina6;
	int zada5 = bina8 - bina8;
	int zada6 = bina8 - bina9;
	System.out.println("Oduzimanje zadatak 1: " + zada1);
	System.out.println("Oduzimanje zadatak 2: " + zada2);
	System.out.println("Oduzimanje zadatak 3: " + zada3);
	System.out.println("Oduzimanje zadatak 4: " + zada4);
	System.out.println("Oduzimanje zadatak 5: " + zada5);
	System.out.println("Oduzimanje zadatak 6: " + zada6);
	int bina11 = 0b110110001011;
	int bina22 = 0b1011100100;
	System.out.println("Provjera oduzimanje zadatak 1: " + bina11);
	System.out.println("Provjera oduzimanje zadatak 2: " + bina22);
	System.out.println();
	
	// TRECI ZADACI :
	int bi1 = 0b111000110101;
	int bi2 = 0b10101010101010;
	int bi3 = 0b1011100011;
	int bi4 = 0b11111111100001;
	int bi5 = 0b1;
	int bi6 = 0b11111111111;
	int bi7 = 0b100000;
	int bi8 = 0b101010101;
	int bi9 = 0b10101010101010;
	int za1 = bi1 - bi2;
	int za2 = bi3 - bi4;
	int za3 = bi5 - bi6;
	int za4 = bi5 - bi7;
	int za5 = bi8 - bi9;
	System.out.println("Oduzimanje 2 zadatak 1: " + za1);
	System.out.println("Oduzimanje 2 zadatak 2: " + za2);
	System.out.println("Oduzimanje 2 zadatak 3: " + za3);
	System.out.println("Oduzimanje 2 zadatak 4: " + za4);
	System.out.println("Oduzimanje 2 zadatak 5: " + za5);
	System.out.println();
	
	// CETVRTI ZADACI
	
	int b1 = 0b111000110101;
	int b2 = 0b10101010;
	int b3 = 0b1011100011;
	int b4 = 0b111111111;
	int b5 = 0b11111111111;
	int b6 = 0b1;
	int b7 = 0b10000000000000;
	int b8 = b6;
	int b9 = 0b101010101010101;
	int b10 = b9;
	int b11 = b9;
	int b12 = 0b10101010101010;
	int z1 = b1 * b2;
	int z2 = b3 * b4;
	int z3 = b5 * b6;
	int z4 = b7 * b8;
	int z5 = b9 * b10;
	int z6 = b11 * b12;
	System.out.println("Mnozenje zadatak 1: " + z1);
	System.out.println("Mnozenje zadatak 2: " + z2);
	System.out.println("Mnozenje zadatak 3: " + z3);
	System.out.println("Mnozenje zadatak 4: " + z4);
	System.out.println("Mnozenje zadatak 5: " + z5);
	System.out.println("Mnozenje zadatak 6: " + z6);
	System.out.println();
	
	// PETI ZADACI :
	
	int bNum = 0b1111111111111;
	System.out.println(bNum);
	
	int oNum = 017777;
	System.out.println(oNum);
	

	// SESTI ZADACI 
	
	int biNum = 0b1111111111111;
	System.out.println(biNum);
	
	int hNum = 0x1FFF;
	System.out.println(hNum);
	
	
	// SEDMI ZADACI
	
	int hexNum = 0xFFA23;
	System.out.println(hexNum);
	
	int binNum = 0b11111111101000100011;
	System.out.println(binNum);
	
	
	}

}
