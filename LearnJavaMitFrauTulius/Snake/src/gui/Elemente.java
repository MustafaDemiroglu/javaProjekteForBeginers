package gui;

import javax.swing.JLabel;
import game.Spiel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Elemente erbt von JLabel (extends)
public class Elemente extends JLabel {
	
	Point p;

	public void paint(Graphics g) {
		super.paint(g);
		
		// Hintergrund Frame
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		// Hintergrund Spielfeld
		g.setColor(Color.BLACK);
		g.fillRect(Gui.xoff, Gui.yoff, 512, 512);
		
		// Raster/Grid Spielfeld (16*16 Felder)
		g.setColor(Color.WHITE);
		
		/*
		 * int x = 0; g.drawRect(Gui.xoff + x*32 , Gui.yoff, 32, 32); x = 1;
		 * g.drawRect(Gui.xoff + x*32, Gui.yoff, 32, 32); x = 2; g.drawRect(Gui.xoff +
		 * x*32, Gui.yoff, 32, 32);
		 */
		
		for (int x=0;x<16;x++) {
			for (int y=0; y<16 ;y++) {
				g.drawRect(Gui.xoff + x*32 , Gui.yoff + y *32 , 32, 32);
			} 
		}
		
		
		
		
		// Rand Spielfeld
		g.setColor(Color.RED);
		g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		
		
		// Frucht - zufallsfarbe
		g.setColor(Color.GREEN);
		p = Spiel.position(Spiel.frucht.getX(), Spiel.frucht.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		
		
		
		// Schlangenkörper - rot
		g.setColor(Color.RED);
		// Fragen wie viele Schwanzteile gibt es? an welcher Position sind sie?
		for (int i =0; i<Spiel.schwanz.size();i++) {
			p = Spiel.position(Spiel.schwanz.get(i).getX(), Spiel.schwanz.get(i).getY() );
			g.fillOval(p.x, p.y, 32, 32);
		}
		
		// Kopf - gelb
		g.setColor(Color.YELLOW);
		p = Spiel.position(Spiel.kopf.getX(), Spiel.kopf.getY());
		g.fillOval(p.x, p.y, 32, 32);
		
		
		
		
		
		
		
		// Punkte anzeigen
		
		
		// Neuzeichnen des fenster
		repaint();
		
	}
}
