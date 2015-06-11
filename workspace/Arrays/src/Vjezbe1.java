import java.util.Arrays;
import java.util.Scanner;


public class Vjezbe1 {

	public static void main(String[] args) {
		

		int[] arr = new int[5];
		
//		System.out.println(arr[4]);
//		System.out.println(arr.length);
		
		Scanner input = new Scanner(System.in);
		
		
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			System.out.println(arr[i]);
		}
		
	}

}
