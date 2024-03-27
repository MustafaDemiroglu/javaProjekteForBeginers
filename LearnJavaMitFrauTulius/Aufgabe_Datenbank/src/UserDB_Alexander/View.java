package UserDB_Alexander;
 
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class View {
 
	JFrame logframe = new JFrame("Einloggen");
	JFrame regframe = new JFrame("Nutzer registrieren");
	JFrame cngframe = new JFrame("Nutzerdaten ändern");
	
	JPanel logpanel = new JPanel();
	JPanel regpanel = new JPanel();
	JPanel cngpanel = new JPanel();
	
	JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Passswort");
	JLabel name = new JLabel("Name");
	JLabel fname = new JLabel("Vorname");
	JLabel email = new JLabel("Email");
	JLabel welc = new JLabel("Hallo" + "databank name & vname");   //temp
	
	JButton login = new JButton("Login");
	JButton reg = new JButton("Neues Konto Anlegen");
	JButton nreg = new JButton("User anlegen");
	JButton data = new JButton("Daten einsehen");
	JButton pwc = new JButton("Passwort ändern");
	JButton del = new JButton("Konto löschen");
	
	JTextField logU = new JTextField();
	JTextField logP = new JTextField();
	
	JTextField regN = new JTextField();
	JTextField regF = new JTextField();
	JTextField regM = new JTextField();
	JTextField regU = new JTextField();
	JTextField regP = new JTextField();
	
	// private controller controller = new controller(this);
	
	View() {
		
		logpanel = new JPanel(new GridLayout(0, 2, 10, 10));
		logpanel.add(user);
		logpanel.add(logU);
		logpanel.add(pass);
		logpanel.add(logP);
		logpanel.add(login);
		logpanel.add(reg);
		
		logframe.add(logpanel);
		logframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		logframe.setSize(500, 500);
		logframe.setVisible(true);
		
		
	}
	
}