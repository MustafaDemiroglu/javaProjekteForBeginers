package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Flow {
	
	public static void gibAus() {
		System.out.println("Ich wurde geklickt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel (new FlowLayout());
		
		/*
		for(int i=1;i<=10;i++) {
			JButton button = new JButton ("Button "+ i);
			panel.add(button);
		}
		*/
		
		// oben sind alle Button eigentlich gleich. wenn wir eine funktion oder Method geben , 
		// dann können wir nicht unterscheide
		
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		JButton b7 = new JButton("Button 7");
		JButton b8 = new JButton("Button 8");
		JButton b9 = new JButton("Button 9");
		JButton b10 = new JButton("Button 10");
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button 1 wurde geklickt");
			}	
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button 2 wurde geklickt");
			}	
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gibAus();
			}	
		});
		
		
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

}
