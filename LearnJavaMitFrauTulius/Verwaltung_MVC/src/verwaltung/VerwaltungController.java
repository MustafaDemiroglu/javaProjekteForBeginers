package verwaltung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
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
	
	// ###### TO-DO: Peform für Buttons
	public void perform_btn_neu() {
		System.out.println("Neu wurde geklickt");
	}
	
	public void perform_btn_aen() {
		System.out.println("Ändern wurde geklickt");
	}
	
	public void perform_btn_spe() {
		System.out.println("Speichern wurde geklickt");
	}
	
	public void perform_btn_loe() {
		System.out.println("Löschen wurde geklickt");
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
