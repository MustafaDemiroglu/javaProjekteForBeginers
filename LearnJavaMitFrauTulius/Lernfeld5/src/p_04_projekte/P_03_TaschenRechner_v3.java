package p_04_projekte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P_03_TaschenRechner_v3 extends JFrame implements ActionListener {
    private JTextField textField;
    private double firstNumber;
    private String operator;

    public P_03_TaschenRechner_v3() {
        setTitle("Taschenrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        textField = new JTextField(20);
        textField.setPreferredSize(new Dimension (280,40));
        textField.setFont(new Font("Arial", Font.PLAIN,20));
        textField.setEditable(false);
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4,20,20));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "√",
                "^"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9.]")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            double secondNumber = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    textField.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    textField.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    textField.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    textField.setText(String.valueOf(firstNumber / secondNumber));
                    break;
                case "^":
                    textField.setText(String.valueOf(Math.pow(firstNumber, secondNumber)));
                    break;
            }
        } else if (command.matches("sin|cos|tan|√")) {
            double number = Double.parseDouble(textField.getText());

            switch (command) {
                case "sin":
                    textField.setText(String.valueOf(Math.sin(Math.toRadians(number))));
                    break;
                case "cos":
                    textField.setText(String.valueOf(Math.cos(Math.toRadians(number))));
                    break;
                case "tan":
                    textField.setText(String.valueOf(Math.tan(Math.toRadians(number))));
                    break;
                case "√":
                    textField.setText(String.valueOf(Math.sqrt(number)));
                    break;
            }
        } else {
            firstNumber = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new P_03_TaschenRechner_v3());
    }
}