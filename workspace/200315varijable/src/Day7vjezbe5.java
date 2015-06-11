
public class Day7vjezbe5 {

	public static void main(String[] args) {
		
		// pokusaj polindroma / uspjesan nakon vjezbe5b
		
		int num = 12321;
		int copy = num;
		int digit;
		int broj = 0;
//		int counter = 0;
		
		do{
			digit = num%10;
			num/=10;
			broj*=10;
			broj+=digit;
//			System.out.print(digit);
//			counter++;
//			broj*=counter;
//			System.out.println(broj);
		} while(num>0);	
//			System.out.println(counter);
//			System.out.println(numC);
		if(broj == copy){
			System.out.println("Broj je polindrom");
		} else {
			System.out.println("Broj nije polindrom");
		}
		
	}

}
