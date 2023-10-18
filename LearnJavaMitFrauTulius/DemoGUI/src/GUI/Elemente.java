package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Elemente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Eerzeugt ein Fenster
		JFrame fenster = new JFrame("Unser Fenster");
		
		// Beim Schliessen des Fensters soll das Program beendet werden
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Erzeuge weiterer elemente
		// JPanel -> Container -> Vergleichbarer mit DIV in HTML
		JPanel panel = new JPanel();
		// kein Layout
		panel.setLayout(null);
		
		// JButton
		JButton button = new JButton("Bitte klicken!");
		// Position und dimension festlegen (x,y,breite,höhe)
		button.setBounds(20,20,200,50);
		
		// JLabel - Beschriftung
		JLabel label = new JLabel ("Hier steht Text");
		label.setBounds(20, 80, 200, 50);
		
		// JTextField - Einzeillige Eingabe
		JTextField text = new JTextField();
		text.setBounds(20, 140, 200, 50);
		
		// Passwort
		JPasswordField geheim = new JPasswordField();
		geheim.setBounds(20,200,200,50);
		
		// JTextArea - mehrzeilige eingabe
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 260, 200, 200);
		
		// JCombobox - Drop-down-Auswahl
		String[] auswahl = {"Käsekuchen", "Marmourkuchen", "Frankfurter Kranz", "Mettbrötchen"};
		JComboBox<String> box = new JComboBox<>(auswahl);
		box.setBounds(20,470,200,50);
		
		// JList - Auswahlliste
		String[] themen = {"Java", "SQL", "IT-Rechnen", "Wiso"};
		JList<String> liste = new JList<>(themen);
		liste.setBounds(20,530,200,100);
		
		// JCheckbox
		JCheckBox checkbox = new JCheckBox("AGB akzeptiert");
		checkbox.setBounds(250, 20, 200, 50);
		
		// JRadioButton / ButtonGroup
		JRadioButton rb1 = new JRadioButton("AWE");
		rb1.setSelected(true);
		JRadioButton rb2 = new JRadioButton("FISI");
		rb1.setBounds(250, 80, 100, 50);
		rb2.setBounds(360, 80, 200, 50);
		
		// JRadiobuttons gruppieren / zusammengehörig
		ButtonGroup beruf = new ButtonGroup();
		beruf.add(rb1);
		beruf.add(rb2);
		
		// Button 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String eingabe = text.getText();
				System.out.println(eingabe);
				
				char[] passwort = geheim.getPassword();
				System.out.println(passwort);
				
				String vielText = textArea.getText();
				System.out.println(vielText);
				
				boolean checked = checkbox.isSelected();
				if (checked) {
					System.out.println("mit AGB einverstanden");
				} else {
					System.out.println("sorry, erst AGB akzeptieren");
				}
				System.out.println(checked);
				
				// Kurzform der Bedingungsprüfung
				System.out.println( checked? "mit AGB einverstanden" : "leider muss zuerst AGB");
				
				// Indexposition von listenelement
				int comboauswahl = box.getSelectedIndex();
				//Inhalt von listenelement
				String comboText = (String) box.getSelectedItem();
				System.out.println(comboauswahl + " - " + comboText);
				
				String radio = rb1.isSelected()? "AWE" : "FISI";
				System.out.println(radio);
				
				label.setText("Ich verändere mich nach Klick");
				
			}
		});
		
		
		// Elemente dem JFrame hinzufügen
		// Fügt Hauptpanel alle elemente hinzu
		panel.add(button);
		panel.add(label);
		panel.add(text);
		panel.add(geheim);
		panel.add(textArea);
		panel.add(box);
		panel.add(liste);
		panel.add(checkbox);
		panel.add(rb1);
		panel.add(rb2);
		
		// fügt Hauptpanel hinzu
		fenster.add(panel);
		
		
		// Breite und Höhe für Fenster festlegen
		fenster.setSize(600,800);
		
		// zentririen, Fenster positionoieren in der Mitte des Bildscirms 
		fenster.setLocationRelativeTo(null);
		
		// Fesnster an beliebiger Stelle positionieren
		// fenster.setLocation(200,300);
		
		// Anzigen des Fenster
		fenster.setVisible(true);
		

	}

}
