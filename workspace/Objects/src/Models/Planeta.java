package Models;

public class Planeta {

	private static final Integer g = 10; // nepromjenjiva vrijednost
	
	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;
	
	public Planeta(Integer tezina, Integer masa, String oblik, String ime) {
		super(); //poziva prvo konstruktor svoje parent klase
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	}
	
	
	/**
	 * Metoda za dodavanje mase
	 * @param dodatak
	 */
	
	public void dodajMasu(Integer dodatak) {
		this.masa += dodatak;
	}
	
	/**
	 * Metoda za ispis vrijednosti mase
	 * @return
	 */
	
	public Integer vrijednostMase() {
		return this.masa;
		
	}
	
	/**
	 * Metoda za racunanje tezine
	 * @return
	 */
	public Integer racunajTezinu() {
		this.tezina = this.masa * g;
		
		return this.tezina;
		
	}

}
