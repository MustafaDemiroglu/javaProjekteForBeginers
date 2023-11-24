package verwaltung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
	private String header="";

	// Konstruktor
	public VerwaltungController(VerwaltungView view) {
		this.view = view;
		this.model = new ArrayList<Teilnehmer>();
	}

	public ListSelectionListener getListSelectionListener() {
			// TODO Auto-generated method stub
			return new ListSelectionListener() {
	 
				@Override
				public void valueChanged(ListSelectionEvent e) {
					/// code nur ausfuehren wenn die liste sich nicht inmitten von (neu)aufbauarbeiten befindet
					if(!e.getValueIsAdjusting()) {
						updateListe();
					}
				}
				
			};
		}
	
	// Listener für Liste
	public void updateListe() {
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
			// Vorlauf aktualisieren
			String aktuelleTeilnehmer = tn.toString();
			view.getVorlauf().setText(aktuelleTeilnehmer + " wurde ausgewählt und wird bearbeitet");
		}
	}
	

	public ActionListener getActionListener() {
		
		return new ActionListener() {
		
			// Listener für Buttons
			public void actionPerformed(ActionEvent e) {
				// Unterscheiden welcher Button Event ausgelöst
				if(e.getSource() == view.getBtn_neu() || e.getSource() == view.getMiNeu()) {
					perform_btn_neu();
				}
				if(e.getSource() == view.getBtn_aen() || e.getSource() == view.getMiAendern()) {
					perform_btn_aen();
				}
				if(e.getSource() == view.getBtn_spe() || e.getSource() == view.getMiSpeichern()) {
					perform_btn_spe();
				}
				if(e.getSource() == view.getBtn_loe() || e.getSource() == view.getMiLoeschen()) {
					perform_btn_loe();
				}
				if(e.getSource() == view.getBtn_vor() || e.getSource() == view.getMiVorlauf()) {
					perform_btn_vor();
				}
				
			}
		};	
	}
	
	

	// Peform für Buttons
	public void perform_btn_neu() {
		/*
		// Lösung von Frau Tulius
				// Textfelder einlesen
				String tnr = view.getTfTnr().getText().trim();
				String gruppe = view.getTfGruppe().getText().trim();
				String name = view.getTfName().getText().trim();
				String vorname = view.getTfVorname().getText().trim();
				if(gruppe.length()<2 || name.length()<2 || vorname.length()<2 || tnr.length()<1) {
					JOptionPane.showMessageDialog(view.getFrame(),"Es gibt leere Daten");
				} else {
					// Tn erzeugen
					Teilnehmer tn = new Teilnehmer (tnr, gruppe, name, vorname);
					// TN in der Liste hinzufügen addElement()
					view.getDlm().addElement(tn);
				}    
		*/		
				// ######## TO-DO : Schauen , ob TN bereits existiert
				// ######## TO-DO : Tn-Nr automatisch, in einer Reihenfolge geben
		
		
		// meine Lösung mit der Hilfe von Michael und von ChatGPT
		
		// Daten aus den Textfeldern lesen
	    String tnr = view.getTfTnr().getText();
	    String gruppe = view.getTfGruppe().getText();
	    String name = view.getTfName().getText();
	    String vorname = view.getTfVorname().getText();

	    // Prüfen, ob alle Felder ausgefüllt sind (optional)
	    if (tnr.isEmpty() || gruppe.isEmpty() || name.isEmpty() || vorname.isEmpty()) {
	        // Optional: Pop-up-Fenster für Fehlermeldung, wenn Felder nicht ausgefüllt sind
	    	// JOptionPane.showMessageDialog(view.getFrame(), "Bitte alle Felder ausfüllen.", "Fehler", JOptionPane.ERROR_MESSAGE);
	    	view.getVorlauf().setText("Bitte alle Felder ausfüllen. Sonst wird den Teilnehmer nicht hinzugefügt.");
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
	        view.getVorlauf().setText(neuerTeilnehmer + " wurde als ein neuer Teilnehmer hinzugefügt");
	        // System.out.println("neu:");
	        // JOptionPane.showMessageDialog(view.getFrame(), "Ein Neues Element wurde hinzugefügt");
	        
	    }
	    
		
	}
	
	public void perform_btn_aen() {
		// das angeklickte Element soll geändert werden
		
		/*
		// lösung von frau tulius
		// welches Element wurde geklickt? getSelectedIndex()
		int index = view.getListe().getSelectedIndex();
		if(index != -1) {
			String tnr = view.getTfTnr().getText().trim();
			String gruppe = view.getTfGruppe().getText().trim();
			String name = view.getTfName().getText().trim();
			String vorname = view.getTfVorname().getText().trim();
			if(gruppe.length()<2 || name.length()<2 || vorname.length()<2 || tnr.length()<1) {
				JOptionPane.showMessageDialog(view.getFrame(),"Eingeben fehlen oder sind nicht korrekt");
			} else {
				// Tn erzeugen
				Teilnehmer tn = new Teilnehmer (tnr, gruppe, name, vorname);
				// TN in der Liste aktualisieren
				view.getDlm().set(index,tn);
			}    
		} else {
			JOptionPane.showMessageDialog(view.getFrame(),"Eingeben fehlen oder sind nicht korrekt");
		}
		*/
		
		// Lesen was in TextFeldern steht getText() ----- trim()
		// Teilnehmer Anlegen Teilnehmer()
		// Teilnehmer in Liste aktualisieren set(index,tn) 
		
		
		
		// Meine Lösung mit der Hilfe von Michael und von ChatGPT
		
		// Überprüfen, ob ein Element ausgewählt ist
	    if (!view.getListe().isSelectionEmpty()) {
	        int selectedIndex = view.getListe().getSelectedIndex();
	        Teilnehmer vorVorlauf =(Teilnehmer) view.getDlm().get(selectedIndex);
            String vorherigeVorlauf = vorVorlauf.toString();

	        // Daten aus den Textfeldern lesen
	        String tnr = view.getTfTnr().getText().trim();
	        String gruppe = view.getTfGruppe().getText().trim();
	        String name = view.getTfName().getText().trim();
	        String vorname = view.getTfVorname().getText().trim();

	        // Prüfen, ob alle Felder ausgefüllt sind (optional)
	        if (tnr.isEmpty() || gruppe.isEmpty() || name.isEmpty() || vorname.isEmpty()) {
	            // Optional: Pop-up-Fenster für Fehlermeldung, wenn Felder nicht ausgefüllt sind
	            // JOptionPane.showMessageDialog(view.getFrame(), "Kein Element wurde ausgewählt, oder nicht alle Felder ausgefüllt.", "Fehler", JOptionPane.ERROR_MESSAGE);
	            view.getVorlauf().setText("Noch keinen Teilnehmer wurde ausgewählt, oder niht alle Felder ausgefüllt.");
	        } else {
	            // Teilnehmer-Objekt erstellen
	            Teilnehmer geaenderterTeilnehmer = new Teilnehmer(tnr, gruppe, name, vorname);
	            String fuerVorlauf = geaenderterTeilnehmer.toString();

	            // Teilnehmer in der Liste aktualisieren
	            System.out.println("info:" + selectedIndex);
	            view.getDlm().set(selectedIndex, geaenderterTeilnehmer);

	            
	            // Optional: Textfelder leeren, nachdem der Teilnehmer geändert wurde
	            view.getTfTnr().setText("");
	            view.getTfGruppe().setText("");
	            view.getTfName().setText("");
	            view.getTfVorname().setText("");
	            
	            // JOptionPane.showMessageDialog(view.getFrame(), "Ausgewähltes Element wurde geändert");
	            view.getVorlauf().setText("alter Teilnehmer " +vorherigeVorlauf + " wurde als neuen Teilnehmer als " +fuerVorlauf +" geändert");
	        }
	    } else {
	        // Anzeigen eines Popup-Fensters, wenn kein Element ausgewählt ist
	        // JOptionPane.showMessageDialog(view.getFrame(), "Kein Element ausgewählt zum Ändern.", "Fehler", JOptionPane.ERROR_MESSAGE);
	        view.getVorlauf().setText("Kein Element wurde ausgewählt, oder noch nicht alle Felder ausgefüllt.");
	    }
		
		
	}
	
	public void perform_btn_spe() {
		/*
		// lösung von Frau Tulius
		try {
			FileWriter fw = new FileWriter("teilnehmer.csv");
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(header);
			bw.newLine();
			
			for (int i=0; i<view.getDlm().size(); i++ ) {
				String tnToCsv = ((Teilnehmer) view.getDlm().getElementAt(i)).toCSV();
				bw.write(tnToCsv);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Fehler beim datei Speichern");
		}
		*/
		
		
		// System.out.println("Speichern wurde geklickt");
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
	        // JOptionPane.showMessageDialog(view.getFrame(), "Daten wurden erfolgreich gespeichert.", "Speichern", JOptionPane.INFORMATION_MESSAGE);
	        view.getVorlauf().setText("Daten wurden erfolgreich gespeichert.");
	    } catch (IOException e) {
	        // Fehler abfangen
	        e.printStackTrace();
	        // JOptionPane.showMessageDialog(view.getFrame(), "Fehler beim Speichern der Daten.", "Fehler", JOptionPane.ERROR_MESSAGE);
	        view.getVorlauf().setText("Fehler beim Speichern der Daten.");
	    }
		
		
	}
	
	public void perform_btn_loe() {
		// das angeklickte Listenelement muss aus der Liste entfernt werden
		/*
		// Lösung von Frau Tulius
		// welches element wurde ausgewählt? getSelectedIndex()
				int index= view.getListe().getSelectedIndex();
				if (index != -1) {
					int selectedIndex = view.getListe().getSelectedIndex();	
					// Element aus der Liste entfernen
					// remove()
					view.getTfTnr().setText("");
					view.getTfGruppe().setText("");
					view.getTfName().setText("");
					view.getTfVorname().setText("");
					// Textfelder "leeren" setText()
					view.getDlm().remove(selectedIndex);
				} else {
					// Anzeigen eines Popup-Fensters, wenn kein Element ausgewählt ist
			        JOptionPane.showMessageDialog(view.getFrame(), "Kein Element ausgewählt zum Löschen.");
				}
		*/
		
		// Meine Lösung mit der Hilfe von ChatGPT
		// Überprüfen, ob ein Element ausgewählt ist
		if(!view.getListe().isSelectionEmpty()) {
			
			int selectedIndex = view.getListe().getSelectedIndex();
			
			Teilnehmer vorVorlauf =(Teilnehmer) view.getDlm().get(selectedIndex);
            String fuerVorlauf = vorVorlauf.toString();
			
			// Element aus der Liste entfernen
			view.getDlm().remove(selectedIndex);
			
			// Textfelder leeren
			view.getTfTnr().setText("");
			view.getTfGruppe().setText("");
			view.getTfName().setText("");
			view.getTfVorname().setText("");
			
			// JOptionPane.showMessageDialog(view.getFrame(), "Ausgewähltes Element  wurde gelöscht");
			view.getVorlauf().setText(fuerVorlauf + " wurde gelöscht.");
		} else {
			
			// Anzeigen eines Popup-Fensters, wenn kein Element ausgewählt ist
	        // JOptionPane.showMessageDialog(view.getFrame(), "Kein Element ausgewählt zum Löschen.");
	        view.getVorlauf().setText("Keinen Teilnehmer wurde ausgewählt zum Löschen.");
		}
		
	}
	
	public void perform_btn_vor() {
		// Vorlauf leeren button entleert die Textfelder und Vorlauf feld
		view.getTfTnr().setText("");
		view.getTfGruppe().setText("");
		view.getTfName().setText("");
		view.getTfVorname().setText("");
		view.getVorlauf().setText("");
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
