
public class Day7vjezbe1 {

	public static void main(String[] args) {

		
		// da li je broj "magican"
		
		int n = 495;
		int suma = 0;
		for (int i=1; i<n; i++){
			if (n%i==0){
				suma+=i;
		}
		}
			if(suma==n){
				System.out.println("magican");
			} else {
				System.out.println("nije magican");
		}
		
		
				
		
		
		
		
	}
}