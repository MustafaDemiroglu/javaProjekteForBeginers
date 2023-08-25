package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Richtung;
import game.Spiel;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// KeyCode
		// a = VK_A
		// Pfeil nach oben --> VK_UP / W
		// Pfeil nach unten --> VK_DOWN / S
		// Pfeil nach links --> VK_LEFT / A
		// Pfeil nach rechts --> VK_RIGHT / D

		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			// Darf nur nach oben, wenn er gerade nicht nach unten geht ...
			// Darf nur gehen, wenn er gerade nicht wartet... z.B. wegen Neuzeichen,
			// Tasteneingabe


			if (!(Spiel.kopf.getRichtung() == Richtung.RUNTER) && !Spiel.waitToMove) {
				Spiel.kopf.setRichtung(Richtung.HOCH);
				// Warten lassen ...
				Spiel.waitToMove = true;
			}
			//System.out.println("hoch");
			break;

		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			if (!(Spiel.kopf.getRichtung() == Richtung.HOCH) && !Spiel.waitToMove) {
				Spiel.kopf.setRichtung(Richtung.RUNTER);
				Spiel.waitToMove = true;
			}
			//System.out.println("runter");
			break;

		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:
			if (!(Spiel.kopf.getRichtung() == Richtung.RECHTS) && !Spiel.waitToMove) {
				Spiel.kopf.setRichtung(Richtung.LINKS);
				Spiel.waitToMove = true;
			}
			//System.out.println("left");
			break;

		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			if (!(Spiel.kopf.getRichtung() == Richtung.LINKS) && !Spiel.waitToMove) {
				Spiel.kopf.setRichtung(Richtung.RECHTS);
				Spiel.waitToMove = true;
			}
			//System.out.println("rechts");
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// Hier später Tastatur abfragen
}
