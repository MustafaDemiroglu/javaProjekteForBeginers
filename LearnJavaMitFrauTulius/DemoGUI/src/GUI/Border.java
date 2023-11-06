package GUI;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class Border {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Beispiel BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNorden 	= new JButton("Norden");
		JButton btnSueden 	= new JButton("Süden");
		JButton btnOsten 	= new JButton("Osten");
		JButton btnWesten 	= new JButton("Westen");
		JButton btnMitte 	= new JButton("Zentrum");
		
		frame.add(btnNorden, BorderLayout.NORTH);
		frame.add(btnSueden, BorderLayout.SOUTH);
		frame.add(btnOsten, BorderLayout.EAST);
		frame.add(btnWesten, BorderLayout.WEST);
		frame.add(btnMitte, BorderLayout.CENTER);
		
		frame.setSize(600,600);
		frame.setVisible(true);

	}

}
