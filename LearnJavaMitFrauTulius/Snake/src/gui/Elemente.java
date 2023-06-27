package gui;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;

// Elemente erbt von JLabel (extends)
public class Elemente extends JLabel {

	public void paint(Graphics g) {
		super.paint(g);
		
		// Hintergrund Frame
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, Gui.width, Gui.height);
		
		// Hintergrund Spielfeld
		g.setColor(Color.BLACK);
		g.fillRect(Gui.xoff, Gui.yoff, 512, 512);
		// Raster/Grid Spielfeld (16*16 Felder)
		
		// Rand Spielfeld
		
		// Schlange
		
	}
}
