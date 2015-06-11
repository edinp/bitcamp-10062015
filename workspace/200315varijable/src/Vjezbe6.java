public class Vjezbe6 {

	public static void main(String[] args) {

		// 1. ZADATAK

		/*
		int n = 5; 
		do { 
			System.out.println("*"); 
			n--; 
			} while (n>0);
		*/

		// 1. ZADATAK (varijanta 2)

		/*
		int n = 3; 
		while (n>0) { 
			System.out.println("*"); 
			n--; 
			}
		*/
		

		// 2. ZADATAK

		/*
		int a = 30; 
		int b = 4;
		int c = 1987; 
		while (c<2015 ) {
			System.out.println("Datumi rodjendana: " + a + "." + b + "." + c + "."); 
			c++; 
			} 
		if (c==2015 && b<=5) {
			System.out.println("Datumi rodjendana: " + a + "." + b + "." + "2015."); 
		} else if (b<=5 && a<=25) {
			System.out.println("Datumi rodjendana: " + a + "." + b + "." + "2015."); 
			}
		 */
		 

		
		// 3. ZADATAK

		/*
		int n = 5; 
		int sum = 0; 
		while(n>0) { 
			sum += n;
			n--;
			System.out.println(sum); 
			}
		 */

		
		// 4. ZADATAK

		// varijanta 1
		
		/*
		int n = 5; 
		int mult = 1; 
		while(n>1) { 
			mult *= n; 
			n--;
			System.out.println(mult); 
			}
		 */

		// varijanta 2
		
		/*
		 int n = 3; 
		 int faktorijel = 1; 
		 int broj = 1; 
		 while(n>=broj) {
		 	faktorijel *= broj; 
		 	broj++; 
		 	System.out.println(faktorijel); 
		 	}
		 */

		// 5. ZADATAK

		/*
		 int n = 100; 
		 while (n>0) { 
		 	if (n%2!=0 && n%3==0 && n%5!=0) {
		 	System.out.println(n); } n--; }
		 */

		
		// 6. ZADATAK

		/*
		int n = 12;
		int brojCifara = 0;
		do {
			n /= 10;
			brojCifara++;
		} while (n > 0);

		System.out.println(brojCifara);
		*/

		
		// 7. ZADATAK
		
		/*
		int a = 343;
		int b = a%10;
		if (a!=b){
			System.out.println("Broj nije palindrom.");
		} else if (a==b) {
		do {
			a/=10;
			System.out.println(a);
		} while (a>0);
		}
		*/
		
		
		// 8. ZADATAK
		
		int a = 253;
		{ 
		int brojDjeljenja1 = 0;	
			do {
			a /= 10;
			brojDjeljenja1++;
		} while (a>0);
			if (brojDjeljenja1>0)
			System.out.println(brojDjeljenja1);
		}
		
		/*	
			
			int brojDjeljenja1 = 0;
		int brojDjeljenja2 = 0;
		int brojDjeljenja3 = 0;
		
		} do {
			a /= 3;
			brojDjeljenja2++;
		} do {
			a /= 5;
			brojDjeljenja3++;
		} while (a>0);
		System.out.println(brojDjeljenja1);
		System.out.println(brojDjeljenja2);
		System.out.println(brojDjeljenja3);
	*/	
	}

}
