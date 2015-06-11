import java.util.Scanner;


public class Day7vjezbe4 {

	public static void main(String[] args) {
		
		// program koji trazi unos nule, i nakon toga
		// broji koliko smo unijeli parnih i neparnih brojeva
		
		Scanner in = new Scanner(System.in);
		int num;
		int counterparni = 0;
		int counterneparni = 0;
		
		do{
			System.out.println("unesite broj: ");
			num = in.nextInt();
			if(num == 0){
			break;
			}
			System.out.println("unijeli ste broj: " + num);
			if (num%2==0){
			counterparni++;
			} else {
				counterneparni++;
			}
		} while (num!=0);
			System.out.println("Broj parnih: " + counterparni);
			System.out.println("Broj neparnih: " + counterneparni);
		
		in.close();

	}

}
