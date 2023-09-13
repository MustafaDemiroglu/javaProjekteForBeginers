package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JLabel;
import game.Spiel;

// Elemente erbt von JLabel (extends)
public class Elemente extends JLabel {

	Point p;
	
	Color randomColor;

    public Elemente() {
        // Erstellen Sie die zufällige Farbe im Konstruktor
        randomColor = generateRandomColor();
    }

	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		// Hintergrund Frame
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, Gui.width, Gui.height);

		// Hintergrund Spielfeld
		g.setColor(Color.BLACK);
		g.fillRect(Gui.xoff, Gui.yoff, 512, 512);

		// Raster/Grid Spielfeld (16x16 Felder)
		g.setColor(Color.WHITE);
		for (int x = 0; x < 16; x++) {
			for (int y = 0; y < 16; y++) {
				g.drawRect(Gui.xoff + x * 32, Gui.yoff + y * 32, 32, 32);
			}
		}

		// Rand Spielfeld
		g.setColor(Color.RED);
		g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		

		// Frucht - Verwenden Sie die zuvor generierte zufällige Farbe
        g.setColor(randomColor);
        p = Spiel.position(Spiel.frucht.getX(), Spiel.frucht.getY());
        g.fillRect(p.x, p.y, 32, 32);
		
		
		// Schlangenkörper - rot
		g.setColor(Color.RED);
		
		
		// Fragen wieviele Schwanzteile gibt es? An welcher Position sind sie?
		for(int i = 0; i < Spiel.schwanz.size(); i++ ) {
			p = Spiel.position(Spiel.schwanz.get(i).getX(), Spiel.schwanz.get(i).getY() );
			g.fillOval(p.x, p.y, 32, 32);
		}
		
		
		// Kopf - gelb
		g.setColor(Color.YELLOW);
		p = Spiel.position(Spiel.kopf.getX(), Spiel.kopf.getY());
		g.fillOval(p.x, p.y, 32, 32);
		
		
		// Punkte anzeigen
		g.setColor(Color.GREEN);
		g.setFont(new Font("Arial", Font.BOLD,20));
		g.drawString("Punkte:", 110, 560);
		g.drawString("Höchste Punkte:", 320,560) ;
		
		g.setColor(Color.RED);
		g.setFont(new Font("Verdana", Font.BOLD, 40));
		g.drawString(" " + Spiel.punkte, 120, 600);
		g.drawString(" "+ Spiel.bestepunkte, 370,600) ;
		
		
		g.setFont(new Font("Georgia", Font.ITALIC, 12));
		g.setColor(Color.BLACK);
		g.drawString("Programmiert von Mustafa Demiroglu", 320, 620);
		
		
		// Neuzeichnen des Fenster
		repaint();
		
	}
	
	private Color generateRandomColor() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        return new Color(red, green, blue);
    }

}
