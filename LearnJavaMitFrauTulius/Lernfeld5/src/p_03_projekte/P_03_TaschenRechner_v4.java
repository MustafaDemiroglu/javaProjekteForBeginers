package p_03_projekte;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P_03_TaschenRechner_v4 extends JFrame implements ActionListener {
   
	private JTextField textField;
    private String input;

    public P_03_TaschenRechner_v4() {
        setTitle("Quantum Taschenrechner v.ElonMusk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(280, 40));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4,10,10));

        String[] buttonLabels = {
                "1", "2", "3", "/",
                "4", "5", "6", "*",
                "7", "8", "9", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "√",
                "^", "C"
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
        
        textField.requestFocusInWindow();
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                calculate();
                break;
            case "C":
                clear();
                break;
            default:
                textField.setText(textField.getText() + command);
                break;
        }
    }

    private void calculate() {
        try {
            String expression = textField.getText();
            double result = evaluateExpression(expression);
            textField.setText(String.valueOf(result));
        } catch (Exception e) {
            textField.setText("Error");
        }
    }

    private double evaluateExpression(String expression) {
        return new Object() {
            int index = -1;
            int currentChar;

            void nextChar() {
                currentChar = (++index < expression.length()) ? expression.charAt(index) : -1;
            }

            boolean isDigitChar() {
                return currentChar >= '0' && currentChar <= '9';
            }

            void eatChar(int charToEat) {
                while (currentChar == ' ')
                    nextChar();
                if (currentChar == charToEat)
                    nextChar();
                else
                    throw new RuntimeException("Unexpected character: " + (char) currentChar);
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (index < expression.length())
                    throw new RuntimeException("Unexpected character: " + (char) currentChar);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (currentChar == '+') {
                        eatChar('+');
                        x += parseTerm();
                    } else if (currentChar == '-') {
                        eatChar('-');
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (currentChar == '*') {
                        eatChar('*');
                        x *= parseFactor();
                    } else if (currentChar == '/') {
                        eatChar('/');
                        x /= parseFactor();
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (currentChar == '+') {
                    eatChar('+');
                    return parseFactor();
                }
                if (currentChar == '-') {
                    eatChar('-');
                    return -parseFactor();
                }

                double x;
                int startPos = index;
                if (currentChar == '(') {
                    eatChar('(');
                    x = parseExpression();
                    eatChar(')');
                } else if (isDigitChar()) {
                    while (isDigitChar())
                        nextChar();
                    x = Double.parseDouble(expression.substring(startPos, index));
                } else if (currentChar == 's' && expression.charAt(index + 1) == 'i' && expression.charAt(index + 2) == 'n') {
                    eatChar('s');
                    eatChar('i');
                    eatChar('n');
                    x = Math.sin(Math.toRadians(parseFactor()));
                } else if (currentChar == 'c' && expression.charAt(index + 1) == 'o' && expression.charAt(index + 2) == 's') {
                    eatChar('c');
                    eatChar('o');
                    eatChar('s');
                    x = Math.cos(Math.toRadians(parseFactor()));
                } else if (currentChar == 't' && expression.charAt(index + 1) == 'a' && expression.charAt(index + 2) == 'n') {
                    eatChar('t');
                    eatChar('a');
                    eatChar('n');
                    x = Math.tan(Math.toRadians(parseFactor()));
                } else if (currentChar == '√') {
                    eatChar('√');
                    x = Math.sqrt(parseFactor());
                } else {
                    throw new RuntimeException("Unexpected character: " + (char) currentChar);
                }

                return x;
            }
        }.parse();
    }

    private void clear() {
        textField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new P_03_TaschenRechner_v4());
    }
}
