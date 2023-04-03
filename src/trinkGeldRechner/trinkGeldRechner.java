import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TrinkgeldRechner extends JFrame {

	private JPanel contentPane;
	private JTextField geldEingabe;
	private JTextField prozentEingabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrinkgeldRechner frame = new TrinkgeldRechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrinkgeldRechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		geldEingabe = new JTextField();
		geldEingabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		geldEingabe.setBounds(82, 42, 440, 20);
		contentPane.add(geldEingabe);
		geldEingabe.setColumns(10);
		
		prozentEingabe = new JTextField();
		prozentEingabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		prozentEingabe.setBounds(82, 73, 440, 20);
		contentPane.add(prozentEingabe);
		
		prozentEingabe.setColumns(10);
		JLabel ergebnisLabel = new JLabel("Ergebnis:");
		ergebnisLabel.setVerticalAlignment(SwingConstants.TOP);
		ergebnisLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ergebnisLabel.setBounds(10, 152, 512, 33);
		contentPane.add(ergebnisLabel);
			 		 		
		JLabel lblNewLabel = new JLabel("Trinkgeldrechner");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(10, 0, 250, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblGeldbetrag = new JLabel("Geldbetrag");
		lblGeldbetrag.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGeldbetrag.setBounds(10, 45, 73, 17);
		contentPane.add(lblGeldbetrag);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prozent ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 76, 62, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Berechnen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double betrag = Double.parseDouble(geldEingabe.getText());
				int prozent = Integer.parseInt(prozentEingabe.getText());
				double trinkgeld = betrag * (prozent / 100d);
				String ausgabe = "Bei einem Rechnungsbetrag von " + betrag + "€ beträgt das Trinkgeld " + String.format("%.2f", trinkgeld) + 
						" (bei " + prozent + "%)";
				ergebnisLabel.setText(ausgabe);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 104, 512, 45);
		contentPane.add(btnNewButton);
		
 
	}
}