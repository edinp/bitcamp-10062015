import Models.Planeta;


public class Objects {

	/**
	 * Vjezbanje objekata u Javi
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Planeta pl = new Planeta(1000, 600, "lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		pl.racunajTezinu();
		System.out.println("PL " + pl.vrijednostMase());
		System.out.println("PL tezina " + pl.racunajTezinu());
		
		Planeta bl = new Planeta(400, 300, "kocka", "Kockazija");
		bl.dodajMasu(-400);
		System.out.println("BL " + bl.vrijednostMase());
		System.out.println("BL tezina " + bl.racunajTezinu());
		
		bl = pl;
		System.out.println("BL " + bl.vrijednostMase());
		System.out.println("BL tezina " + bl.racunajTezinu());
		

	}
	
	

}
