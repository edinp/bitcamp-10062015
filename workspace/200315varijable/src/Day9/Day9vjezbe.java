package Day9;

public class Day9vjezbe {

	public static void main(String[] args) {
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		
	
		
		for (int i = 1; i<=1000; i++){
			int d = (int)(Math.random() * 5 + 1);
			
			if (d == 1) {
				c1++;
			} else if (d == 2) {
				c2++;
			} else if (d == 3) {
				c3++;
			} else if (d == 4) {
				c4++;
			} else if (d == 5) {
				c5++;
			}
		System.out.print(d + " ");
		System.out.println();
		

		}	
		System.out.println("Broj keceva: " + c1);
		System.out.println("Broj dvica: " + c2);
		System.out.println("Broj trica: " + c3);
		System.out.println("Broj cvrki: " + c4);
		System.out.println("Broj petica: " + c5);

	}

}
