package p_01_demo;

import javax.swing.JOptionPane;

public class D_07_Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Die Nachricht, die angezeigt werden soll!");

		String eingabe = JOptionPane.showInputDialog("Ihr Benzinverbrauch:");
		eingabe = eingabe.replace(",", ".");

		try {
			// Integer.parseInt()
			double verbrauch = Double.parseDouble(eingabe);

			System.out.println(verbrauch);
		} catch (Exception e) {
			System.out.println("Fehler: " + e);
		}

	}

}