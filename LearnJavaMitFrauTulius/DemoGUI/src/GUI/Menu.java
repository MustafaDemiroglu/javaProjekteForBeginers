package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Menu implements ActionListener {

	public Menu() {
		JFrame frame= new JFrame("Menu Beispiel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu menu;
		JMenuBar menuBar;
		JMenuItem mi;
		JMenu subMenu;
		
		menuBar = new JMenuBar();
		
		// 1. Eintrag in MenuBar
		menu = new JMenu("Konfiguration");
		menu.setMnemonic('K');
		
		// 1. Eintrag zu Datei
		mi = new JMenuItem ("Optionen");
		KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(ks);
		mi.setMnemonic('O');
		mi.addActionListener(this);
		menu.add(mi);
		
		// 2. Eintrag zu Datei
		mi = new JMenuItem("Farben");
		KeyStroke kf = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(kf);
		mi.setEnabled(false);
		mi.setMnemonic('F');
		mi.addActionListener(this);
		menu.add(mi);
		
		// 3. Eintrag zu Datei
		mi = new JMenuItem("Import");
		KeyStroke ki = KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(ki);
		mi.setMnemonic('I');
		mi.addActionListener(this);
		menu.add(mi);
		
		// Trennlinie
		menu.addSeparator();
		
		// 4. Eintrag zu Datei
		mi = new JMenuItem("Beenden", new ImageIcon("./src/GUI/b_drop.png"));
		KeyStroke kb = KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(kb);
		mi.setMnemonic('B');
		mi.addActionListener(this);
		menu.add(mi);
		
		
		// 1. Eintrag "Datei" er Menubar hinzufügen
		menuBar.add(menu);
		
		
		// 2. Eintrag in der MenuBar
		menu = new JMenu("Artikel");
		menu.setMnemonic('A');
		// 1. Eintrag zu Artikel
		mi = new JMenuItem ("KatzenKram");
		KeyStroke kk = KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(kk);
		mi.setMnemonic('K');
		mi.addActionListener(this);
		menu.add(mi);
		// 1. Eintrag zu Artikel - als Untermenu
		subMenu = new JMenu("Hundekram");
		subMenu.setMnemonic('H');
		// 1. Eintrag im Untermenu "Hundekram
		mi = new JMenuItem ("Knochen");
		KeyStroke khk = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(khk);
		mi.addActionListener(this);
		mi.setMnemonic('K');
		mi.addActionListener(this);
		subMenu.add(mi);
		mi = new JMenuItem("Spielzeug");
		KeyStroke khs = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		mi.setAccelerator(khs);
		mi.setMnemonic('S');
		mi.addActionListener(this);
		subMenu.add(mi);
		// Untermenu dem Hauptpunkt zufügen
		subMenu.add(mi);
		
		menu.add(subMenu);
		
		// 2. eitrag "Artikel der Menubar hinzufügen
		menuBar.add(menu);
		
		// komplettes Menu dem Frame hinzufügen
		frame.add(menuBar, BorderLayout.NORTH);
		
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equalsIgnoreCase("optionen")) {
			System.out.println("Menupunkt Optionen wurde anklickt");	
		}
		
		if (e.getActionCommand().equalsIgnoreCase("farben")) {
			System.out.println("Menupunkt Farben wurde anklickt");	
		}
		
		if (e.getActionCommand().equalsIgnoreCase("import")) {
			System.out.println("Menupunkt Import wurde anklickt");	
		}
		
		if(e.getActionCommand().equalsIgnoreCase("beenden")) {
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		if (e.getActionCommand().equalsIgnoreCase("katzenkram")) {
			System.out.println("Menupunkt Katzenkram wurde anklickt");	
		}
		
		if (e.getActionCommand().equalsIgnoreCase("hundekram")) {
			System.out.println("Menupunkt Hundekram wurde anklickt");	
		}
		
		if (e.getActionCommand().equalsIgnoreCase("knochen")) {
			System.out.println("Menupunkt Knochen wurde anklickt");	
		}
		
		if (e.getActionCommand().equalsIgnoreCase("spielzeug")) {
			System.out.println("Menupunkt Spielzeug wurde anklickt");	
		}
		
		
	}
	
	public static void main(String[] args) {
		new Menu();

	}

}
