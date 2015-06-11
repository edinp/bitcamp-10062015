
public class Day7part5 {

	public static void main(String[] args) {
		
		// trazenje najmanjeg zajednickog djelioca
		// varijanta 1
		int a = 5;
		int b = 15;
		
		int min = a;
		if (min>b){
			min=b;
		}
		
		for (int i=2; i<=min; i++)
			if(a%i==0 && b%i==0){
				System.out.println("Najmanji djelioc je: " + i);
				break;
			}

		// varijanta 2
		for (int i = 2; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0){
				System.out.println("Najmanji djelioc je: " + i);
				break;
			}
		}
	}

}
