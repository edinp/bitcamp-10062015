
public class Day7vjezbe5b {

	public static void main(String[] args) {
		
		int n = 121;
		int copy = n;
		int reverse = 0;
		while (n>0){
			int digit = n%10;
			reverse = reverse*10;
			reverse = reverse + digit;
			n = n / 10;
		}
		if(reverse==copy){
			System.out.println("palindrom");
		} else {
			System.out.println("nije palindrom");
		}
	}

}
