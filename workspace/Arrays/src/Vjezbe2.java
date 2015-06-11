
public class Vjezbe2 {

	public static void main(String[] args) {
		

		int[] niz = new int[9];
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] = (int)(Math.random()*10+1);
			System.out.println(niz[i]);
			
		
			
		}	
		
		System.out.println();
		
		
		// foreach petlja
		
		for(int vrijednost : niz){
			System.out.println(vrijednost);
		}

	}

}
