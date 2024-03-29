package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MixLayout {
	
	JFrame frame = new JFrame("Beispiel MixLayout");
	

	JButton btnNorden 	= new JButton("Norden");
	//JButton btnSueden 	= new JButton("Süden");
	JButton btnOsten 	= new JButton("Osten");
	JButton btnWesten 	= new JButton("Westen");
	// JButton btnMitte 	= new JButton("Zentrum");
	JPanel pnCenter = new JPanel();
	JPanel pnSueden = new JPanel();
	
	JButton btn1 = new JButton ("Button 1");
	JButton btn2 = new JButton ("Button 2");
	JButton btn3 = new JButton ("Button 3");
	JButton btn4 = new JButton ("Button 4");
	JButton btn5 = new JButton ("Button 5");
	JButton btn6 = new JButton ("Button 6");
	JButton btn7 = new JButton ("Button 7");
	
	
	public MixLayout() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(btnNorden, BorderLayout.NORTH);
		
		pnCenter.setLayout(new GridLayout(2,2));
		pnCenter.add(btn1);
		pnCenter.add(btn2);
		pnCenter.add(btn3);
		pnCenter.add(btn4);
		
		frame.add(pnCenter, BorderLayout.CENTER);
		
		pnSueden.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnSueden.add(btn5);
		pnSueden.add(btn6);
		pnSueden.add(btn7);
		frame.add(pnSueden, BorderLayout.SOUTH);
		
		frame.add(btnOsten, BorderLayout.EAST);
		frame.add(btnWesten, BorderLayout.WEST);
		
		
		
		
		
		frame.setSize(600,600);
		frame.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MixLayout();
		

	}

}
