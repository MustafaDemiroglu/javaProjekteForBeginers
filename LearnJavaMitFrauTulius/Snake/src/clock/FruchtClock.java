package clock;

import game.Frucht;
import game.Spiel;

public class FruchtClock extends Thread {

    public void run() {
        while (GameClock.spielen) {
            try {
                // Warte für eine bestimmte Zeit, z.B., alle 5 Sekunden
                sleep(5000);
                Spiel.frucht.reset();
                
                // ich habe mit Spiel.frucht.reset(); geändert
                //Frucht.reset();
                
                
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}