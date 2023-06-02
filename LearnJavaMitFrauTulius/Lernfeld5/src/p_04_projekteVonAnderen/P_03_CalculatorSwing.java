package p_04_projekteVonAnderen;

//with basic +, -, /, * using java swing elements 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class P_03_CalculatorSwing extends JFrame implements ActionListener {
	// create a frame
	static JFrame frameToDisplay;

	// create a textfield
	static JTextField labeTextField;

	// it store the operands and operators
	String string0, string1, string2;

	// constructor
	P_03_CalculatorSwing () {
		string0 = string1 = string2 = "";
	}

	// main function to java application
	public static void main(String args[]) {
		// create the frame to display the screen
		frameToDisplay = new JFrame("My Calculator");

		try {
			// used to set the look and feel for the application
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}

		// create the class object
		P_03_CalculatorSwing  calculatorSwing = new P_03_CalculatorSwing ();

		// create text field
		labeTextField = new JTextField(16);

		// set to the non editable
		labeTextField.setEditable(false);

		// declaring numbers buttons and operators buttons
		JButton button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
				button_add, button_subtract, button_div, button_mul, button_dot, button_equal1, button_equal2;
		// creating numbers buttons
		button_0 = new JButton("0");
		button_1 = new JButton("1");
		button_2 = new JButton("2");
		button_3 = new JButton("3");
		button_4 = new JButton("4");
		button_5 = new JButton("5");
		button_6 = new JButton("6");
		button_7 = new JButton("7");
		button_8 = new JButton("8");
		button_9 = new JButton("9");
		// creating equals buttons
		button_equal2 = new JButton("=");
		// creating operators like +,-,*,/ buttons
		button_add = new JButton("+");
		button_subtract = new JButton("-");
		button_div = new JButton("/");
		button_mul = new JButton("*");
		button_equal1 = new JButton("C");
		// creating dot(.) buttons
		button_dot = new JButton(".");
		// creating panel
		JPanel jPanel = new JPanel();
		// adding action listeners to the buttons
		button_mul.addActionListener(calculatorSwing);
		button_div.addActionListener(calculatorSwing);
		button_subtract.addActionListener(calculatorSwing);
		button_add.addActionListener(calculatorSwing);
		button_9.addActionListener(calculatorSwing);
		button_8.addActionListener(calculatorSwing);
		button_7.addActionListener(calculatorSwing);
		button_6.addActionListener(calculatorSwing);
		button_5.addActionListener(calculatorSwing);
		button_4.addActionListener(calculatorSwing);
		button_3.addActionListener(calculatorSwing);
		button_2.addActionListener(calculatorSwing);
		button_1.addActionListener(calculatorSwing);
		button_0.addActionListener(calculatorSwing);
		button_dot.addActionListener(calculatorSwing);
		button_equal1.addActionListener(calculatorSwing);
		button_equal2.addActionListener(calculatorSwing);
		// add all elements to the panel
		jPanel.add(labeTextField);
		jPanel.add(button_add);
		jPanel.add(button_1);
		jPanel.add(button_2);
		jPanel.add(button_3);
		jPanel.add(button_subtract);
		jPanel.add(button_4);
		jPanel.add(button_5);
		jPanel.add(button_6);
		jPanel.add(button_mul);
		jPanel.add(button_7);
		jPanel.add(button_8);
		jPanel.add(button_9);
		jPanel.add(button_div);
		jPanel.add(button_dot);
		jPanel.add(button_0);
		jPanel.add(button_equal1);
		jPanel.add(button_equal2);
		// set background of the panel
		jPanel.setBackground(Color.darkGray);
		// add the panel to the frame
		frameToDisplay.add(jPanel);
		frameToDisplay.setSize(210, 230);
		frameToDisplay.show();
	}
	//action listener implementation
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		// check if the given  value is number
		if ((input.charAt(0) >= '0' && input.charAt(0) <= '9') || input.charAt(0) == '.') {
			// if operand is present then add to second no
			if (!string1.equals(""))
				string2 = string2 + input;
			else
				string0 = string0 + input;
			// set the value to the text
			labeTextField.setText(string0 + string1 + string2);
		} else if (input.charAt(0) == 'C') {
			// clearing
			string0 = string1 = string2 = "";
			// set the value of the text
			labeTextField.setText(string0 + string1 + string2);
		} else if (input.charAt(0) == '=') {
			double equalsInput;
			// store the value in the first index
			if (string1.equals("+"))
				equalsInput = (Double.parseDouble(string0) + Double.parseDouble(string2));
			else if (string1.equals("-"))
				equalsInput = (Double.parseDouble(string0) - Double.parseDouble(string2));
			else if (string1.equals("/"))
				equalsInput = (Double.parseDouble(string0) / Double.parseDouble(string2));
			else
				equalsInput = (Double.parseDouble(string0) * Double.parseDouble(string2));
			// set the value of the text
			labeTextField.setText(string0 + string1 + string2 + "=" + equalsInput);
			// converting int to string
			string0 = Double.toString(equalsInput);
			string1 = string2 = "";
		} else {
			// if no operand is there
			if (string1.equals("") || string2.equals(""))
				string1 = input;
			else {
				double te;
				// store the value in the first index
				if (string1.equals("+"))
					te = (Double.parseDouble(string0) + Double.parseDouble(string2));
				else if (string1.equals("-"))
					te = (Double.parseDouble(string0) - Double.parseDouble(string2));
				else if (string1.equals("/"))
					te = (Double.parseDouble(string0) / Double.parseDouble(string2));
				else
					te = (Double.parseDouble(string0) * Double.parseDouble(string2));
				// converting int to string
				string0 = Double.toString(te);
				// put the operator
				string1 = input;
				// take the operand as blank
				string2 = "";
			}
			// set the value of the text
			labeTextField.setText(string0 + string1 + string2);
		}
	}
}