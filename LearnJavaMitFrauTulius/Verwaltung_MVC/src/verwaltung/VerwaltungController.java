package verwaltung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class VerwaltungController {

	private VerwaltungView view;
	private List<Teilnehmer> model;

	// Konstruktor
	public VerwaltungController(VerwaltungView view) {
		this.view = view;
		this.model = new ArrayList<Teilnehmer>();
	}

	
	
	// Listener für Liste
	public void valueChanged(ListSelectionEvent e) {
		// ###### TO-DO: Bei änderung textfelder aktualisieren 
		
		
		/*
		 * if (!e.getValueIsAdjusting()) {
		/// code nur ausfuehren wenn die liste sich nicht inmitten von (neu)aufbauarbeiten 
		 * befindet
			}
		 */
		
		
		
		Teilnehmer tn = (Teilnehmer) view.getListe().getSelectedValue();
		if(tn != null) {
			// Textfelder aktualisieren
			view.getTfTnr().setText(tn.getTnr());
			view.getTfGruppe().setText(tn.getGruppe());
			view.getTfName().setText(tn.getName());
			view.getTfVorname().setText(tn.getVorname());
		}
	}
	

	public ActionListener getActionListener() {
		
		return new ActionListener() {
		
			// Listener für Buttons
			public void actionPerformed(ActionEvent e) {
				// Unterscheiden welcher Button Event ausgelöst
				if(e.getSource() == view.getBtn_neu()) {
					perform_btn_neu();
				}
				if(e.getSource() == view.getBtn_aen()) {
					perform_btn_aen();
				}
				if(e.getSource() == view.getBtn_spe()) {
					perform_btn_spe();
				}
				if(e.getSource() == view.getBtn_loe()) {
					perform_btn_loe();
				}
			}
		};	
	}
	
	// Peform für Buttons
	public void perform_btn_neu() {
		System.out.println("Neu wurde geklickt");
		// Textfelder einlesen
		// TN erzeugen
		// TN der Liste hinzufügen addElement()
		// Zusatzaufgabe optional popup: Prüfen ob alle Felder geschrieben
		
		// meine Lösung mit der Hilfe von Michael und von ChatGPT
		
		// Daten aus den Textfeldern lesen
	    String tnr = view.getTfTnr().getText();
	    String gruppe = view.getTfGruppe().getText();
	    String name = view.getTfName().getText();
	    String vorname = view.getTfVorname().getText();

	    // Prüfen, ob alle Felder ausgefüllt sind (optional)
	    if (tnr.isEmpty() || gruppe.isEmpty() || name.isEmpty() || vorname.isEmpty()) {
	        // Optional: Pop-up-Fenster für Fehlermeldung, wenn Felder nicht ausgefüllt sind
	        JOptionPane.showMessageDialog(view.getFrame(), "Bitte alle Felder ausfüllen.", "Fehler", JOptionPane.ERROR_MESSAGE);
	    } else {
	        // Teilnehmer-Objekt erstellen
	        Teilnehmer neuerTeilnehmer = new Teilnehmer(tnr, gruppe, name, vorname);

	        // Teilnehmer zur Liste hinzufügen
	        view.getDlm().addElement(neuerTeilnehmer);

	        // Optional: Textfelder leeren, nachdem ein neuer Teilnehmer hinzugefügt wurde
	        view.getTfTnr().setText("");
	        view.getTfGruppe().setText("");
	        view.getTfName().setText("");
	        view.getTfVorname().setText("");
	        JOptionPane.showMessageDialog(view.getFrame(), "Ein Neues Element wurde hinzugefügt");
	    }
	        	
	}
	
	public void perform_btn_aen() {
		System.out.println("Ändern wurde geklickt");
		// das angeklickte Element soll geändert werden
		// welches Element wurde geklickt? getSelectedIndex()
		// Lesen was in TextFeldern steht getText() ----- trim()
		// Teilnehmer Anlegen Teilnehmer()
		// Teilnehmer in Liste aktualisieren set(index,tn) 
		
		
		// Meine Lösung mit der Hilfe von Michael und von ChatGPT
		
		// Überprüfen, ob ein Element ausgewählt ist
	    if (!view.getListe().isSelectionEmpty()) {
	        int selectedIndex = view.getListe().getSelectedIndex();

	        // Daten aus den Textfeldern lesen
	        String tnr = view.getTfTnr().getText().trim();
	        String gruppe = view.getTfGruppe().getText().trim();
	        String name = view.getTfName().getText().trim();
	        String vorname = view.getTfVorname().getText().trim();

	        // Prüfen, ob alle Felder ausgefüllt sind (optional)
	        if (tnr.isEmpty() || gruppe.isEmpty() || name.isEmpty() || vorname.isEmpty()) {
	            // Optional: Pop-up-Fenster für Fehlermeldung, wenn Felder nicht ausgefüllt sind
	            JOptionPane.showMessageDialog(view.getFrame(), "Bitte alle Felder ausfüllen.", "Fehler", JOptionPane.ERROR_MESSAGE);
	        } else {
	            // Teilnehmer-Objekt erstellen
	            Teilnehmer geaenderterTeilnehmer = new Teilnehmer(tnr, gruppe, name, vorname);

	            // Teilnehmer in der Liste aktualisieren
	            view.getDlm().set(selectedIndex, geaenderterTeilnehmer);

	            /*
	            // Optional: Textfelder leeren, nachdem der Teilnehmer geändert wurde
	            view.getTfTnr().setText("");
	            view.getTfGruppe().setText("");
	            view.getTfName().setText("");
	            view.getTfVorname().setText("");
	            */
	            
	            JOptionPane.showMessageDialog(view.getFrame(), "Ausgewähltes Element wurde geändert");
	        }
	    } else {
	        // Anzeigen eines Popup-Fensters, wenn kein Element ausgewählt ist
	        JOptionPane.showMessageDialog(view.getFrame(), "Kein Element ausgewählt zum Ändern.", "Fehler", JOptionPane.ERROR_MESSAGE);
	    }
		
		
	}
	
	public void perform_btn_spe() {
		System.out.println("Speichern wurde geklickt");
		// veränderte /gelöschte/ neu angelegte TN in Datei speichern
		// FileWriter / BufferReader
		// Überschriften in Datei schreiben
		// Zeilenumbruh
		// Mit Schleife die List auslesen und jeden Listenpunkt in DAtei schreiben Teilnehmer.toCSV()
		// Writer close
		// try/catch
		
		
		
		// Meine Lösung mit der Hilfe von Michael und von ChatGPT
		try {
	        // Datei zum Schreiben öffnen
	        BufferedWriter writer = new BufferedWriter(new FileWriter("teilnehmer.csv"));

	        // Überschriften in die Datei schreiben
	        writer.write("TN-Nr;Gruppe;Name;Vorname");
	        writer.newLine();

	        // Alle Teilnehmer in der Liste durchgehen und in die Datei schreiben
	        for (int i = 0; i < view.getDlm().size(); i++) {
	            Teilnehmer tn = (Teilnehmer) view.getDlm().getElementAt(i);
	            String csvLine = tn.toCSV();
	            writer.write(csvLine);
	            writer.newLine();
	        }

	        // Writer schließen
	        writer.close();

	        // Optional: Nachricht über erfolgreiche Speicherung anzeigen
	        JOptionPane.showMessageDialog(view.getFrame(), "Daten erfolgreich gespeichert.", "Speichern", JOptionPane.INFORMATION_MESSAGE);
	    } catch (IOException e) {
	        // Fehler abfangen
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(view.getFrame(), "Fehler beim Speichern der Daten.", "Fehler", JOptionPane.ERROR_MESSAGE);
	    }
		
		
		
		
		
	}
	
	public void perform_btn_loe() {
		System.out.println("Löschen wurde geklickt");
		
		// das angeklickte Listenelement muss aus der Liste entfernt werden
		// welches element wurde ausgewählt? getSelectedIndex()
		// remove()
		// Textfelder "leeren" setText()
		
		// Meine Lösung mit der Hilfe von ChatGPT
		// Überprüfen, ob ein Element ausgewählt ist
		if(!view.getListe().isSelectionEmpty()) {
			
			int selectedIndex = view.getListe().getSelectedIndex();
			
			// Element aus der Liste entfernen
			view.getDlm().remove(selectedIndex);
			
			// Textfelder leeren
			view.getTfTnr().setText("");
			view.getTfGruppe().setText("");
			view.getTfName().setText("");
			view.getTfVorname().setText("");
			
			JOptionPane.showMessageDialog(view.getFrame(), "Ausgewähltes Element  wurde gelöscht");
		} else {
			
			// Anzeigen eines Popup-Fensters, wenn kein Element ausgewählt ist
	        JOptionPane.showMessageDialog(view.getFrame(), "Kein Element ausgewählt zum Löschen.");
		}
		

		
		
	}
	
	
	// CSV-Datei einlesen
		public void leseDatei() {
			// CSV-Datei einlesen und Werte an Textfelder / Liste übergeben 
			
			try {
				// Datei öffnen
				FileReader fr = new FileReader("teilnehmer.csv");
				BufferedReader br = new BufferedReader(fr);
				
				// 1. Zeile mit Überschriften "überspringen"
				String header = br.readLine();
				String zeile = "";
				
				//aktuelle Zeile eilnesen und prüfen, ob Inhalt vorhanden ist
				while((zeile=br.readLine()) !=null) {
					StringTokenizer st = new StringTokenizer(zeile, ";");
							
					String tnr = st.nextToken();
					String gruppe = st.nextToken();
					String name = st.nextToken();
					String vorname = st.nextToken();
					
					// Teilnehmer erzeugen
					Teilnehmer tn = new Teilnehmer(tnr, gruppe, name, vorname);
					// Teilnehme zur Liste hinzufügen
					view.getDlm().addElement(tn);	
				}
				
				br.close();
				fr.close();
				
			} catch(Exception e) {
				// Fehler abfangen
				System.out.println("Fehler bei der Datei");
			}
		}

}
