package actions;

import java.awt.event.KeyListener;
import game.Spiel;
import game.Richtung;

import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// KeyCode
				// a=VK_A
				// Pfeil nach oben		--> VK_UP / W 
				// Pfeil nach unten		--> VK_DOWN / S
				// Pfeil nach links		--> VK_LEFT / A
				// Pfeil nach rechts	--> VK_RIGHT / D
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
				case KeyEvent.VK_W:
					// Darf nur nach oben, wenn er gerade nach unten geht
					// darf nur gehen, wenn er gerade nicht wartet .... z.B. wegen Neuzeichen, Tasteneingabe
					/*
					if (!(Spiel.kopf.getRichtung()==Richtung.RUNTER)&& !Spiel.waitToMove) {
						Spiel.kopf.setRichtung(Richtung.HOCH);
						// Warten lassen ....
						Spiel.waitToMove = true ;
					}
					*/
					if (!(Spiel.kopf.getRichtung()==Richtung.RUNTER)) {
						Spiel.kopf.setRichtung(Richtung.HOCH);
						// Warten lassen ....
						Spiel.waitToMove = true ;
					}
					
					
					System.out.println("hoch");
					break;
				case KeyEvent.VK_DOWN:
				case KeyEvent.VK_S:
					
					if (!(Spiel.kopf.getRichtung()==Richtung.HOCH)) {
						Spiel.kopf.setRichtung(Richtung.RUNTER);
						// Warten lassen ....
						Spiel.waitToMove = true ;
					}
					
					System.out.println("unten");
					break;
				case KeyEvent.VK_LEFT:
				case KeyEvent.VK_A:
					
					if (!(Spiel.kopf.getRichtung()==Richtung.RECHTS)) {
						Spiel.kopf.setRichtung(Richtung.LINKS);
						// Warten lassen ....
						Spiel.waitToMove = true ;
					}
					
					System.out.println("links");
					break;
				case KeyEvent.VK_RIGHT:
				case KeyEvent.VK_D:
					
					if (!(Spiel.kopf.getRichtung()==Richtung.LINKS)) {
						Spiel.kopf.setRichtung(Richtung.RECHTS);
						// Warten lassen ....
						Spiel.waitToMove = true ;
					}
					
					System.out.println("rechts");
					break;
					
				}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
