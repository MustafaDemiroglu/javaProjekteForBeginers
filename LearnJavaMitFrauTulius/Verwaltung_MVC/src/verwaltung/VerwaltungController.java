package verwaltung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import java.util.ArrayList;

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
	}
	
	// CSV-Datei einlesen
	public void leseDatei() {
		// ###### TO-DO: CSV-Datei einlesen und Werte an Textfelder / Liste übergeben 
	}

	public ActionListener getActionListener() {
		
		return new ActionListener() {
		
			// Listener für Buttons
			public void actionPerformed(ActionEvent e) {
				// ###### TO-DO: Unterscheiden welcher Button Event ausgelöst
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

}
