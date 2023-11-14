package verwaltung;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VerwaltungView {

	private JFrame frame;
	
	private JPanel mainPanel;
	private JPanel tnPanel;
	private JPanel inputPanel;
	private JPanel labelPanel;
	private JPanel textPanel;
	private JPanel buttonPanel;
	private JPanel listePanel;
	
	private JTextField tfTnr;
	private JTextField tfGruppe;
	private JTextField tfName;
	private JTextField tfVorname;
	
	private JButton btn_neu;
	private JButton btn_aen;
	private JButton btn_spe;
	private JButton btn_loe;
	
	private DefaultListModel dlm = new DefaultListModel();
	private JList liste = new JList(dlm);
	
	// Controller
	private VerwaltungController controller = new VerwaltungController(this);
	
	// Konstruktor
	public VerwaltungView() {
		
		frame = new JFrame("Teilnehmerverwaltung");
		
		// labelPanel
		labelPanel = new JPanel(new GridLayout(0,1,10,10));
		labelPanel.add(new JLabel("TN-Nr",JLabel.RIGHT));
		labelPanel.add(new JLabel("Gruppe",JLabel.RIGHT));
		labelPanel.add(new JLabel("Name",JLabel.RIGHT));
		labelPanel.add(new JLabel("Vornam",JLabel.RIGHT));
		
		// textLabel
		textPanel = new JPanel(new GridLayout(0,1,10,10));
		tfTnr =new JTextField();
		textPanel.add(tfTnr);
		tfGruppe =new JTextField();
		textPanel.add(tfGruppe);
		tfName =new JTextField();
		textPanel.add(tfName);
		tfVorname =new JTextField();
		textPanel.add(tfVorname);
		
		// buttonPanel
		buttonPanel = new JPanel(new FlowLayout());
		btn_neu = new JButton("Neu");
		buttonPanel.add(btn_neu);
		btn_aen = new JButton("Ändern");
		buttonPanel.add(btn_aen);
		btn_spe = new JButton("Speichern");
		buttonPanel.add(btn_spe);
		btn_loe = new JButton("Löschen");
		buttonPanel.add(btn_loe);
		
		// listePanel
		listePanel = new JPanel(new BorderLayout());
		// erzeugt Rahmen und Titel für das Panel
		listePanel.setBorder(new TitledBorder("TN-Liste"));
		// JScrollPane erzeugt scrollbare Liste
		listePanel.add(new JScrollPane(liste));
		
		// inputPanel
		inputPanel = new JPanel(new BorderLayout(10,10));
		inputPanel.setBorder(new TitledBorder("Teilnehmer"));
		inputPanel.add(labelPanel, BorderLayout.WEST);
		inputPanel.add(textPanel, BorderLayout.CENTER);
		
		// tnPanel
		tnPanel = new JPanel(new BorderLayout(10,10));
		tnPanel.add(inputPanel, BorderLayout.NORTH);
		tnPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		// mainPanel
		mainPanel = new JPanel(new BorderLayout(0,10));
		// Leerer Rahmen für Abstand (top, left, bottom, right)
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.add(tnPanel, BorderLayout.WEST);
		mainPanel.add(listePanel, BorderLayout.CENTER);
		
		
		
		// Actionlistener zu Buttons / Liste hinzufügen
		// Listener ist in Verwaltung Controller ausgelagert
		btn_neu.addActionListener(controller.getActionListener());
		btn_aen.addActionListener(controller.getActionListener());
		btn_spe.addActionListener(controller.getActionListener());
		btn_loe.addActionListener(controller.getActionListener());
		
		// CSV - Datei einlesen - leseDatei() in VerwaltunggsController
		controller.leseDatei();
		
		// Fenster / frame konfigurieren
		frame.add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setVisible(true);
		
		
	}

	public JTextField getTfTnr() {
		return tfTnr;
	}

	public void setTfTnr(JTextField tfTnr) {
		this.tfTnr = tfTnr;
	}

	public JTextField getTfGruppe() {
		return tfGruppe;
	}

	public void setTfGruppe(JTextField tfGruppe) {
		this.tfGruppe = tfGruppe;
	}

	public JTextField getTfName() {
		return tfName;
	}

	public void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	public JTextField getTfVorname() {
		return tfVorname;
	}

	public void setTfVorname(JTextField tfVorname) {
		this.tfVorname = tfVorname;
	}

	public JButton getBtn_neu() {
		return btn_neu;
	}

	public void setBtn_neu(JButton btn_neu) {
		this.btn_neu = btn_neu;
	}

	public JButton getBtn_aen() {
		return btn_aen;
	}

	public void setBtn_aen(JButton btn_aen) {
		this.btn_aen = btn_aen;
	}

	public JButton getBtn_spe() {
		return btn_spe;
	}

	public void setBtn_spe(JButton btn_spe) {
		this.btn_spe = btn_spe;
	}

	public JButton getBtn_loe() {
		return btn_loe;
	}

	public void setBtn_loe(JButton btn_loe) {
		this.btn_loe = btn_loe;
	}

	public JList getListe() {
		return liste;
	}

	public void setListe(JList liste) {
		this.liste = liste;
	}
	

}
