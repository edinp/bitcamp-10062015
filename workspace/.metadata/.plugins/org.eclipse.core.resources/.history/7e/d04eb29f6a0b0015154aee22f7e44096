package Day15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
		
		
	}
	
	/*
	 *   Moja metoda za crtanje kvadratica, tj sahovskih polja
	 *   (koristi DrawWindow koji je napravio Zaid) 
	 */
	
	
	public static void drawRectangles (int n, int m, Graphics g) {
		
		int x = 30;
		int y = 300;
		
		for (int i = 0; i<n; i++){	
			for (int j = 0; j<m; j++) {
				
				g.setColor(Color.BLACK);
				g.drawRect(x, y, 30, 30);
				x+=30;
			} 
			y+=30;
			x=30;
		}
		
			
		}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		drawRectangles(5, 3, g);
		
		// *******************
		w.setImage(img);
	}
}
