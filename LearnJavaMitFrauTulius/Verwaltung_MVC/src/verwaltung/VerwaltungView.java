package verwaltung;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VerwaltungView {

	private JFrame frame;
	
	private JPanel mainPanel;
	private JPanel tnPanel;
	private JPanel inputpanel;
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
	private VerwaltungController controller = new VerwaltungController();
	
	private VerwaltungView() {
		
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
		// inputPanel
		// tnPanel
		// mainPanel
	}
	

}
