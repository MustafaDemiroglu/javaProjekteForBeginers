package game;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import actions.Kollision;
import clock.GameClock;
import gui.Gui;

public class Spiel {

	// Die Punkte und die Bestepukte soll man sehen
	public static int punkte=0, bestepunkte=0;

	public static int getPunkte() {
		return punkte;
	}

	public static void setPunkte(int newPunkte) {
		punkte = newPunkte;
	}

	
	// 1 x Kopf
	public static Kopf kopf = new Kopf(7, 7);

	// 0 - x Schwanzteilen
	public static ArrayList<Schwanz> schwanz = new ArrayList<>();

	// Frucht initilalisieren
	public static Frucht frucht = new Frucht();

	// weiter zu spielen
	public static boolean waitToMove = false;

	
	// Spielgeschwindigkeit
	static int spielGeschwindigkeit = 200;

	public static int getSpielGeschwindigkeit() {
		return spielGeschwindigkeit;
	}

	public static void setSpielGeschwindigkeit(int newSpielGeschwindigkeit) {
		spielGeschwindigkeit = newSpielGeschwindigkeit;
	}

	// Füge die Pause-Variable hinzu
	public static boolean pause = false;

	public static void addSchwanz() {
		// Spielbeginn --> erstes Element an Kopf ansetzen
		if (schwanz.size() < 1) {
			schwanz.add(new Schwanz(kopf.getX(), kopf.getY()));
		} else {
			// schon Früchte gefressen
			// --> Wieviele Schwanzteile vorhanden?
			// --> neues Element ans Ende setzen
			schwanz.add(new Schwanz(schwanz.get(schwanz.size() - 1).x, schwanz.get(schwanz.size() - 1).y));

		}
	}

	public static void bewegen() {

		if (!pause) {

			// Schwanzteile bewegen (falls mehr als 2 Teile)
			if (schwanz.size() >= 2) {
				for (int i = schwanz.size() - 1; i >= 1; i--) {
					if (schwanz.get(i).isWait()) {
						schwanz.get(i).setWait(false);
					} else {
						schwanz.get(i).setX(schwanz.get(i - 1).getX());
						schwanz.get(i).setY(schwanz.get(i - 1).getY());
					}
				}
			}
			
			// Erstes Schwanzteil bewegen (direkt mach Kopf)
			if (schwanz.size() >= 1) {
				if (schwanz.get(0).isWait()) {
					schwanz.get(0).setWait(false);
				} else {
					schwanz.get(0).setX(kopf.getX());
					schwanz.get(0).setY(kopf.getY());
				}
			}

			// Kopf bewegen
			// Rechts --> x + 1
			// Links --> x -1
			// Runter --> y + 1
			// Hoch --> y -1

			switch (kopf.getRichtung()) {
			case RECHTS:
				kopf.setX(kopf.getX() + 1);
				break;
			case LINKS:
				kopf.setX(kopf.getX() - 1);
				break;
			case HOCH:
				kopf.setY(kopf.getY() - 1);
				break;
			case RUNTER:
				kopf.setY(kopf.getY() + 1);
				break;
			}
		}

	}
	
	
	// Pixel/Punkte in Koordinaten umwandeln
	public static Point position(int x, int y) {

		Point p = new Point(0, 0);

		// Felder 32x32
		// z.B. 3 Feld --> 3 * 32
		p.x = x * 32 + Gui.xoff;
		p.y = y * 32 + Gui.yoff;

		return p;

	}
	
	
	
	
	
	
	// Gameover and Game enden und exit

			public static void gameOverFrucht() {

				GameClock.spielen = false;
				int option = JOptionPane.showConfirmDialog(null, "Giftige Frucht gegessen! Spiel neu starten?", null, 1);
				switch (option) {
				case 0:
					Spiel.setPunkte(0);
					Spiel.setSpielGeschwindigkeit(200);
					Spiel.schwanz.clear();
					Spiel.kopf.setX(7);
					Spiel.kopf.setY(7);
					GameClock.spielen = true;
					break;
				default:
					System.exit(0);
					break;
				}
			}

			
			public static void gameOverWand() {

				GameClock.spielen = false;
				int option = JOptionPane.showConfirmDialog(null, "Gegen die Wand! Spiel neu starten?", null, 1);
				switch (option) {
				case 0:
					Spiel.setPunkte(0);
					Spiel.setSpielGeschwindigkeit(200);
					Spiel.schwanz.clear();
					Spiel.kopf.setX(7);
					Spiel.kopf.setY(7);
					GameClock.spielen = true;
					break;
				default:
					System.exit(0);
					break;
				}
			}

			public static void gameOverSchwanz() {

				GameClock.spielen = false;
				int option = JOptionPane.showConfirmDialog(null, "Selbst gefressen! Spiel neu starten?", null, 1);
				switch (option) {
				case 0:
					Spiel.setPunkte(0);
					Spiel.setSpielGeschwindigkeit(200);
					Spiel.schwanz.clear();
					Spiel.kopf.setX(7);
					Spiel.kopf.setY(7);
					// Spiel.kopf.setRichtung();
					GameClock.spielen = true;
					break;
				default:
					System.exit(0);
					break;
				}
			}

			
			
			

}
