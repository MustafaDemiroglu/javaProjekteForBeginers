package p_03_projekte;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P_03_TaschenRechner_v6 extends JFrame implements ActionListener {

    public JTextField display;
    public JButton[] buttons;
    public String[] buttonLabels = {
        "1", "2", "3", "/",
        "4", "5", "6", "*",
        "7", "8", "9", "-",
        "0", ".", "=", "+",
        "sin", "cos", "tan", "√",
        "^","mod","%","C"       
    };

    double zahl1;
    double zahl2;
    char operator;
    boolean isFirstCalculation = true;

    public P_03_TaschenRechner_v6() {
        setTitle("Quantum Taschenrechner v.ElonMusk");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(440, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setPreferredSize(new Dimension(400, 60));
        display.setFont(new Font("Arial", Font.PLAIN, 40));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 10, 10));

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
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                if (isFirstCalculation) {
                    berechnen();
                    isFirstCalculation = false;
                } else {
                    berechnen();
                    zahl1 = Double.parseDouble(display.getText()); // Speichern Sie das Ergebnis der vorherigen Berechnung
                    operator = '\0'; // Setzen Sie den Operator für die nächste Berechnung auf null
                }
                break;
            case "C":
                entfern();
                break;
            default:
                display.setText(display.getText() + command);
                break;
        }
    }

    public void entfern() {
        display.setText("");
        isFirstCalculation = true; // Setzen Sie die Variable isFirstCalculation auf true, um eine neue Berechnung zu starten
    }
    
    private void berechnen() {
        try {
            String expression = display.getText();
            double ergebnis = evaluateExpression(expression);
            display.setText(String.valueOf(ergebnis));
        } catch (Exception e) {
            display.setText("Error");
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
                    } else if (currentChar == '^') {
                        eatChar('^');
                        x = Math.pow(x, parseFactor());
                    } else if (currentChar == 'm' && expression.charAt(index + 1) == 'o' && expression.charAt(index + 2) == 'd') {
                        eatChar('m');
                        eatChar('o');
                        eatChar('d');
                        x %= parseFactor();
                    } else if (currentChar == '%') {
                        eatChar('%');
                        x = x * (parseFactor() / 100);
                    } else {
                        return x;
                    }
                }
            }
            
    	
            private double parseFactor() {
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
    	}

            public static void main(String[] args) {
            	SwingUtilities.invokeLater(() -> {
                	P_03_TaschenRechner_v6 calculator = new P_03_TaschenRechner_v6();
                    calculator.setVisible(true);
                });
            }
    	}
            