package GUIvjezbe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
//		g.setColor(Color.BLACK);
//		g.drawLine(50,100,100,50);
//		g.drawLine(100,50,100,200);
//		
//		g.drawOval(150,50,100,150);
//		
//		g.drawLine(300,100,350,50);
//		g.drawLine(350,50,350,200);
//		
//		g.drawOval(50, 250, 400, 200);
//		g.setFont(new Font("Cambria", Font.BOLD, 14));
//		g.drawString("* 2", 150, 300);
//		g.drawString("A={2, 4, 8}", 120, 480);
//		g.drawString("* 4", 380, 330);
//		g.drawString("* 8", 300, 420);
//		
//		g.drawOval(350, 250, 400, 200);
//		g.drawString("B={4, 7, 1}", 520,480);
//		g.drawString("* 7", 480, 370);
//		g.drawString("* 1", 580, 310);
//		
		/*
		 *  sahovska ploca, pokusaj
		 */
		
//		int x = 0;
//		int z = 30;
//		
//		for(int y = 0; y<=240; y+=30) {
//			for(int i = 0; i<=7; i++) {
//				if (i%2==0) {
//					g.setColor(Color.RED);
//					g.fillRect(x, y, 30, 30);
//					x+=60;
//				} else {
//					g.setColor(Color.BLUE);
//					g.fillRect(z, y, 30, 30);
//					z+=60;
//				}
//			} 
//			x=30;
//			z=0;
//		}
//		
		
		/*
		 * SAHOVSKA PLOCA
		 */
		
//		int x;
//		int y;
//		
//		for(int row = 0; row < 8; row++){
//			for(int col = 0; col < 8; col++){
//				x = row * 40;
//				y = col * 40;
//				
//				if ((row % 2 == 0) == (col % 2 == 0)){
//					g.setColor(Color.RED);
//					g.fillRect(200 + x, 200 + y, 40, 40);				
//				} else {
//					g.setColor(Color.BLUE);
//					g.fillRect(200 + x, 200 + y, 40, 40);	
//				}
//			}
//		}
		
		g.setColor(Color.BLACK);
		g.drawRect(10, 10, 400, 200);
		
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 400, 20);
		
		g.setColor(Color.WHITE);
		g.fillRect(15, 15, 10, 10);
		
		g.setColor(Color.RED);
		g.fillRect(370, 10, 30, 15);
		g.setColor(Color.WHITE);
		g.drawString("X", 382, 22);
		g.setColor(Color.BLACK);
		g.drawString("_", 350, 22);
		g.drawString("JAVA Drawing", 170, 24);
		g.drawString("An array of numbers", 150, 70);
		g.drawString("Type: int", 180, 130);
	
		Integer num = 0;
		int x = 25;
		for(int i = 0; i <=10; i++){
			g.drawRect(x, 80, 34, 34);
			num = (int)(10*Math.random());
			g.drawString(num.toString(), x+10, 100);
			x+=34;
		}
		
		
		g.drawLine(100,400,300,400);
		g.drawLine(200,300,200,500);
		g.drawLine(120,320,280,480);
		g.drawLine(120,480,280,320);
		
		
		// *******************
		w.setImage(img);
	}
}
