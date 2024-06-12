package Liegeplatzdaten;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Liegeplatzdaten {

	private JFrame frame;
	private JTextField txtBezeichnung;
	private JTextField txtLaenge;
	private JTextField txtBreite;
	private JTextField txtWassertiefe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Liegeplatzdaten window = new Liegeplatzdaten();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Liegeplatzdaten() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 1100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\dozen\\Desktop\\_ kw 20\\firmenlogo.png"));
		
		JLabel lblTitel = new JLabel("Liegeplatzdaten");
		lblTitel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("Bezeichnung:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtBezeichnung = new JTextField();
		txtBezeichnung.setHorizontalAlignment(SwingConstants.CENTER);
		txtBezeichnung.setForeground(new Color(205, 133, 63));
		txtBezeichnung.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBezeichnung.setColumns(10);
		
		txtLaenge = new JTextField();
		txtLaenge.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaenge.setForeground(new Color(0, 0, 0));
		txtLaenge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLaenge.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("L\u00E4nge (m)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtBreite = new JTextField();
		txtBreite.setHorizontalAlignment(SwingConstants.CENTER);
		txtBreite.setForeground(new Color(0, 0, 0));
		txtBreite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBreite.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Breite (m)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtWassertiefe = new JTextField();
		txtWassertiefe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWassertiefe.setForeground(new Color(0, 0, 0));
		txtWassertiefe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtWassertiefe.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Wassertiefe (cm):");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Status:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox cbStatus = new JComboBox();
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"verf\u00FCgbar", "vermietet", "belegt", "gesperrt"}));
		cbStatus.setForeground(new Color(0, 0, 0));
		cbStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblBild = new JLabel("Bild:");
		lblBild.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBild.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("C:\\Users\\dozen\\Desktop\\_ kw 20\\liegeplatz.png"));
		
		JButton btnSpeichern = new JButton("Daten speichern");
		btnSpeichern.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNeu = new JButton("Neues Bild");
		btnNeu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnSchliessen = new JButton("Dialog schlie\u00DFen");
		btnSchliessen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		btnSchliessen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogo)
					.addGap(18)
					.addComponent(lblTitel, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
					.addGap(232))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(89)
							.addComponent(btnSpeichern, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnNeu, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, Alignment.TRAILING)
								.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
								.addComponent(lblNewLabel_4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtWassertiefe, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(cbStatus, 0, 226, Short.MAX_VALUE)
								.addComponent(txtBezeichnung, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(txtLaenge, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(txtBreite, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(lblBild, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(image, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSchliessen, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(87)
							.addComponent(image, 0, 0, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLogo))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addComponent(lblTitel)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(txtBezeichnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBild, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(9)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtLaenge, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(15)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtBreite, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
							.addGap(9)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtWassertiefe, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSchliessen, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSpeichern)
						.addComponent(btnNeu, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(736, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

