package p_01_demo;

import javax.swing.JOptionPane;

public class D_07_Dialog {
	
	public static void main (String [] args) {
		
		// TODO
		
		JOptionPane.showMessageDialog(null, "Die Nachricht die angezeigt werden ist : ") ;
		String eingabe = JOptionPane.showInputDialog("Ihr Benzinverbrauch : ") ;
		eingabe = eingabe.replace("," , ".") ;
		
		
		
		
		
	}

}
