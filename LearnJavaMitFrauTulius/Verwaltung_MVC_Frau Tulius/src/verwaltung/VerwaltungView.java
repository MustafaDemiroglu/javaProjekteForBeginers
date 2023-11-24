package verwaltung;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VerwaltungView {

	private JFrame frame;
	
	// Menu erstellen
	private JMenu menu;
	private JMenuBar menuBar;
	
	private JMenuItem miNeu;
	private JMenuItem miAendern;
	private JMenuItem miSpeichern;
	private JMenuItem miLoeschen;
	private JMenuItem miVorlauf;
	
	
	private JPanel mainPanel;
	private JPanel tnPanel;
	private JPanel inputPanel;
	private JPanel labelPanel;
	private JPanel textPanel;
	private JPanel buttonPanel;
	private JPanel listePanel;
	private JPanel vorlaufPanel;
	
	private JTextField tfTnr;
	private JTextField tfGruppe;
	private JTextField tfName;
	private JTextField tfVorname;
	
	private JTextArea vorlauf;
	
	private JButton btn_neu;
	private JButton btn_aen;
	private JButton btn_spe;
	private JButton btn_loe;
	private JButton btn_vor;
	
	
	private DefaultListModel dlm = new DefaultListModel();
	private JList liste = new JList(dlm);
	
	// Controller
	private VerwaltungController controller = new VerwaltungController(this);
	
	// Konstruktor
	public VerwaltungView() {
		
		frame = new JFrame("Teilnehmerverwaltung");
		
		// Menu
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		// Menu Eintrag
		menu = new JMenu("Eintrag");
		menuBar.add(menu);
		menu.setMnemonic('E');
		// Menu Items
		// Neu Teilnehmer Menu Item
		miNeu = new JMenuItem("Neu Teilnehmer", new ImageIcon("./src/verwaltung/neueTeilnehmer.png"));
		KeyStroke kneu = KeyStroke.getKeyStroke("control shift N");
		miNeu.setAccelerator(kneu);
		miNeu.setEnabled(true);
		miNeu.setMnemonic('N');
		menu.add(miNeu);
		// Ändern Teilnehmer Menu Item
		miAendern = new JMenuItem("Ändern", new ImageIcon("./src/verwaltung/aendern.png"));
		KeyStroke kaen = KeyStroke.getKeyStroke("control shift A");
		miAendern.setAccelerator(kaen);
		miAendern.setEnabled(true);
		miAendern.setMnemonic('A');
		menu.add(miAendern);
		// Speichern Menu Item
		miSpeichern = new JMenuItem("Speichern", new ImageIcon("./src/verwaltung/speichern.png"));
		KeyStroke kspe = KeyStroke.getKeyStroke("control shift S");
		miSpeichern.setAccelerator(kspe);
		miSpeichern.setEnabled(true);
		miSpeichern.setMnemonic('S');
		menu.add(miSpeichern);
		// Löschen Menu Item
		miLoeschen = new JMenuItem("Löschen", new ImageIcon("./src/verwaltung/loeschen.png"));
		KeyStroke kloe = KeyStroke.getKeyStroke("control shift L");
		miLoeschen.setAccelerator(kloe);
		miLoeschen.setEnabled(true);
		miLoeschen.setMnemonic('L');
		menu.add(miLoeschen);
		// Vorlauf Menu Item
		miVorlauf = new JMenuItem("Vorlauf leeren", new ImageIcon("./src/verwaltung/vorlaufLeeren.png"));
		KeyStroke kvor = KeyStroke.getKeyStroke("control shift V");
		miVorlauf.setAccelerator(kvor);
		miVorlauf.setEnabled(true);
		miVorlauf.setMnemonic('V');
		menu.add(miVorlauf);
			
		
		// labelPanel
		labelPanel = new JPanel(new GridLayout(0,1,10,10));
		labelPanel.add(new JLabel("TN-Nr",JLabel.RIGHT));
		labelPanel.add(new JLabel("Gruppe",JLabel.RIGHT));
		labelPanel.add(new JLabel("Name",JLabel.RIGHT));
		labelPanel.add(new JLabel("Vorname",JLabel.RIGHT));
		
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
		btn_neu = new JButton("Neu",new ImageIcon("./src/verwaltung/neueTeilnehmer.png") );
		buttonPanel.add(btn_neu);
		btn_aen = new JButton("Ändern", new ImageIcon("./src/verwaltung/aendern.png"));
		buttonPanel.add(btn_aen);
		btn_spe = new JButton("Speichern", new ImageIcon("./src/verwaltung/speichern.png"));
		buttonPanel.add(btn_spe);
		btn_loe = new JButton("Löschen", new ImageIcon("./src/verwaltung/loeschen.png"));
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
		
		// vorlaufPanel
		vorlaufPanel = new JPanel(new FlowLayout());
		vorlaufPanel.add(new JLabel("Vorlauf"));
		vorlauf =new JTextArea();
		vorlauf.setSize(460,40);    
	    vorlauf.setLineWrap(true);
	    vorlauf.setEditable(false);
	    vorlauf.setVisible(true);
		vorlaufPanel.add(vorlauf);
		btn_vor = new JButton("Vorlauf leeren", new ImageIcon("./src/verwaltung/vorlaufLeeren.png"));
		vorlaufPanel.add(btn_vor);
		
		
		// mainPanel
		mainPanel = new JPanel(new BorderLayout(0,10));
		// Leerer Rahmen für Abstand (top, left, bottom, right)
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.add(tnPanel, BorderLayout.WEST);
		mainPanel.add(listePanel, BorderLayout.CENTER);
		mainPanel.add(vorlaufPanel, BorderLayout.SOUTH);
		
		
		
		// Actionlistener zu Buttons / Liste hinzufügen
		// Listener ist in Verwaltung Controller ausgelagert
		// Aufruf 
		liste.addListSelectionListener(controller.getListSelectionListener());
		btn_neu.addActionListener(controller.getActionListener());
		btn_aen.addActionListener(controller.getActionListener());
		btn_spe.addActionListener(controller.getActionListener());
		btn_loe.addActionListener(controller.getActionListener());
		btn_vor.addActionListener(controller.getActionListener());
		
		// MenuListener eintragen
		miNeu.addActionListener(controller.getActionListener());
		miAendern.addActionListener(controller.getActionListener());
		miSpeichern.addActionListener(controller.getActionListener());
		miLoeschen.addActionListener(controller.getActionListener());
		miVorlauf.addActionListener(controller.getActionListener());
		
		
		
		
		// CSV - Datei einlesen - leseDatei() in VerwaltunggsController
		controller.leseDatei();
		
		// Fenster / frame konfigurieren
		frame.add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
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
	
	public JTextArea getVorlauf() {
		return vorlauf;
	}

	public void setVorlauf(JTextArea vorlauf) {
		this.vorlauf = vorlauf;
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
	

	public JButton getBtn_vor() {
		return btn_vor;
	}

	public void setBtn_vor(JButton btn_vor) {
		this.btn_vor = btn_vor;
	}

	public JList getListe() {
		return liste;
	}

	public void setListe(JList liste) {
		this.liste = liste;
	}
	
	public DefaultListModel getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel dlm) {
		this.dlm = dlm;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public JMenu getMenu() {
		return menu;
	}

	public void setMenu(JMenu menu) {
		this.menu = menu;
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenuItem getMiNeu() {
		return miNeu;
	}

	public void setMiNeu(JMenuItem miNeu) {
		this.miNeu = miNeu;
	}

	public JMenuItem getMiAendern() {
		return miAendern;
	}

	public void setMiAendern(JMenuItem miAendern) {
		this.miAendern = miAendern;
	}

	public JMenuItem getMiSpeichern() {
		return miSpeichern;
	}

	public void setMiSpeichern(JMenuItem miSpeichern) {
		this.miSpeichern = miSpeichern;
	}

	public JMenuItem getMiLoeschen() {
		return miLoeschen;
	}

	public void setMiLoeschen(JMenuItem miLoeschen) {
		this.miLoeschen = miLoeschen;
	}

	public JMenuItem getMiVorlauf() {
		return miVorlauf;
	}

	public void setMiVorlauf(JMenuItem miVorlauf) {
		this.miVorlauf = miVorlauf;
	}


}
