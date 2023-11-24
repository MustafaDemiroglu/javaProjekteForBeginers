package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;


public class Gui {
	
	JFrame frame = new JFrame("Teilnehmerverwaltung");
	
	JPanel mainPanel = new JPanel();
	JPanel tnPanel = new JPanel();
	JPanel listePanel =  new JPanel();
	JPanel inputPanel =  new JPanel();
	JPanel labelPanel =  new JPanel();
	JPanel textPanel =  new JPanel();
	JPanel buttonPanel =  new JPanel();
		

	JButton btn1 = new JButton("Neu");
	JButton btn2 = new JButton("Ändern");
	JButton btn3 = new JButton("Löschen");
	JButton btn4 = new JButton("Speichern");
	
	JLabel tnNr = new JLabel("TN-Nr");
	JLabel gruppe = new JLabel("Gruppe");
	JLabel name = new JLabel("Name");
	JLabel vorname = new JLabel("Vorname");
	
	JTextField teilnehmerNr = new JTextField();
	JTextField gruppeInput = new JTextField();
	JTextField nameInput = new JTextField();
	JTextField vornameInput = new JTextField();
	
	
	
	
	Border blackline = BorderFactory.createLineBorder(Color.BLACK);
	
	
	
	public Gui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(mainPanel);
		mainPanel.setLayout(new GridLayout(1,2));
		mainPanel.add(tnPanel);
		mainPanel.add(listePanel);
		
		tnPanel.setBorder(BorderFactory.createTitledBorder(blackline, "Teilnehmer"));
		listePanel.setBorder(BorderFactory.createTitledBorder(blackline, "TN-liste"));
		
		tnPanel.add(inputPanel);
		tnPanel.setLayout(new GridLayout(2,1));
		inputPanel.setLayout(new GridLayout(1,2));
		inputPanel.setBorder(BorderFactory.createTitledBorder(blackline));
		
		inputPanel.add(labelPanel);
		labelPanel.setLayout(new GridLayout(4,1));
		labelPanel.add(tnNr);
		labelPanel.add(gruppe);
		labelPanel.add(name);
		labelPanel.add(vorname);
		
		inputPanel.add(textPanel);
		textPanel.setLayout(new GridLayout(4,0));
		textPanel.add(teilnehmerNr);
		textPanel.add(gruppeInput);
		textPanel.add(nameInput);
		textPanel.add(vornameInput);
		
		tnPanel.add(buttonPanel);
		buttonPanel.setBorder(BorderFactory.createTitledBorder(blackline));
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		
		String[] teilnehmer1 = {"1","AWE","Mustafa","Demiroglu"};
		JList tListe = new JList(teilnehmer1);
		String[] teilnehmer2 = {"2","AWE","Mustafa","Demiroglu"};
		tListe = new JList(teilnehmer2);
		String[] teilnehmer3 = {"3","AWE","Mustafa","Demiroglu"};
		tListe = new JList(teilnehmer3);
		String[] teilnehmer4 = {"4","AWE","Mustafa","Demiroglu"};
		tListe = new JList(teilnehmer4);
		String[] teilnehmer5 = {"5","AWE","Mustafa","Demiroglu"};
		tListe = new JList(teilnehmer5);
		
		listePanel.add(tListe);
		
		
		
		frame.setSize(700,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);	
	}
	
	public static void main (String[] args) {
		new Gui();
	}

}
