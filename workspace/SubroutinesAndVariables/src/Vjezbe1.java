
public class Vjezbe1 {

	public static int getMax (int a, int b) {
		if (a>b) {
			return a;
		}
		return b;
		
		
	}
	
	
	public static String getExtension (String fileName) {
		
		String extenzija = "";	
		
		for (int i = fileName.length()-1; i >= 0; i--) {
			extenzija=fileName.charAt(i)+extenzija;
		
		if(fileName.charAt(i) == '.') {
				break;
		}  
		}		
		return extenzija;		
	
		
		

	}
	
	public static boolean canBeBinary (int num) {
		
		while(num%10 < 2 && num != 0){
			num/=10;
		}
		if (num < 2) {
			return true;
		} 
		return false;
	}	
		
	
	public static int getRandomNumber (int a, int b) {
		if(b>=a){
			int num = (int)(Math.random()*(b-a)) + a;
			return num;
		} else {
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getMax(5,2));
		
		System.out.println(getExtension("tekstovi.txt"));
		
		System.out.println(canBeBinary(1015));
		
		System.out.println(getRandomNumber(5,9));
		
		
	}

}
