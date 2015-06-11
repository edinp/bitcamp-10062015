import java.util.Scanner;


public class Vjezbe5 {

	public static void main(String[] args) {
		

//		Scanner in = new Scanner(System.in);
//		System.out.println("Unesite nesto pravo zanimljivo: ");
//		String str = in.nextLine();
//		int duzina = str.length();
//		char[] karakteri = new char[duzina];
//		String zanimljivo = "";
//		char slovo;
//		char slovo1;
//		String zanimljivo1 = "";
//		
//		for(int i = 0; i < str.length(); i++){
//			slovo = str.charAt(i);
//			zanimljivo+=slovo;
//		}
//		
//		for (int i = str.length()-1; i >=0; i--){
//			slovo1 = str.charAt(i);
//			zanimljivo1+=slovo1;
//		} System.out.println(zanimljivo1);
		
		Scanner in = new Scanner (System.in);
		System.out.println("Unesite nesto: ");
		
		String str = in.nextLine();
		int duzina = str.length();
		
		char[] karakter = new char[duzina];
		
		for (int i = 0; i < duzina; i++){
			karakter[i] = str.charAt(i);
		}
		
		for (int i = duzina - 1; i >=0; i--) {
			System.out.print(karakter[i]);
		} 
		
		
		in.close();
	}

}
