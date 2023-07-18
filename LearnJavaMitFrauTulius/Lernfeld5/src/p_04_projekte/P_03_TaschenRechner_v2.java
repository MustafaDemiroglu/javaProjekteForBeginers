package p_04_projekte;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P_03_TaschenRechner_v2 extends JFrame implements ActionListener {

    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            
            
    };

    private double firstOperand;
    private double secondOperand;
    private char operator;

    public P_03_TaschenRechner_v2() {
        setTitle("Taschenrechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setPreferredSize(new Dimension(280, 40));
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 10, 10));

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 30));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        setLayout(new FlowLayout());
        add(display);
        add(buttonPanel);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();

        switch (buttonLabel) {
            case "=":
                calculate();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = buttonLabel.charAt(0);
                firstOperand = Double.parseDouble(display.getText());
                display.setText("");
                break;
            default:
                display.setText(display.getText() + buttonLabel);
                break;
        }
    }

    private void calculate() {
        secondOperand = Double.parseDouble(display.getText());
        double result = 0.0;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0)
                    result = firstOperand / secondOperand;
                else
                    display.setText("Error");
                break;
        }

        display.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	P_03_TaschenRechner_v2 calculator = new P_03_TaschenRechner_v2();
            calculator.setVisible(true);
        });
    }
}