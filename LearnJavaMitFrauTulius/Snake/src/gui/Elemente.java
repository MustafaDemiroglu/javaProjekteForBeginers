package gui;

import javax.swing.JLabel;

import game.Schlange;

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
		for (int x=0;x<16;x++) {
			g.drawRect(Gui.xoff + x*32 , Gui.yoff, 32, 32);
			for (int y=0; y<16 ;y++) {
				g.drawRect(Gui.xoff + x*32 , Gui.yoff + y *32 , 32, 32);
			} 
		}
		
		
		
		
		// Rand Spielfeld
		g.setColor(Color.RED);
		g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		
		
		// Frucht - zufallsfarbe
		
		
		// Schlange - rot
		
		// Kopf - gelb
		g.setColor(Color.YELLOW);
		p = Schlange.position(Schlange.kopf.getX(), Schlange.kopf.getY());
		g.fillOval(p.x, p.y, 32, 32);
		
		// Schlangenkörper / Schwanz
		
		// Punkte anzeigen
		
		
		// Neuzeichnen des fenster
		repaint();
		
	}
}
