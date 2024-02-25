/**
 *
 * Mohamed Yasser Elshoky 
 * 120210381
 * CSE sec 5
 * GP 2
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculatorGUI extends JFrame {
    private JTextField display;

    private double result;

    public ScientificCalculatorGUI() {
        result = 0;

        setTitle("Scientific Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        JPanel buttonPanel = createButtonPanel();

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/", "sqrt",
                "4", "5", "6", "*", "x^2",
                "1", "2", "3", "-", "x^y",
                "0", ".", "=", "+", "C",
                "sin", "cos", "tan", "pi", "e",
                "asin", "acos", "atan", "log", "ln",
                "abs", "!", "(", ")", "|x|"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new CalculatorButtonListener());
            panel.add(button);
        }

        return panel;
    }

    private class CalculatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case "=":
                    calculateResult();
                    break;
                case "C":
                    clearDisplay();
                    break;
                case "sin":
                    performTrigFunction("sin");
                    break;
                case "cos":
                    performTrigFunction("cos");
                    break;
                case "tan":
                    performTrigFunction("tan");
                    break;
                case "sqrt":
                    performSquareRoot();
                    break;
                case "asin":
                    performInverseTrigFunction("asin");
                    break;
                case "acos":
                    performInverseTrigFunction("acos");
                    break;
                case "atan":
                    performInverseTrigFunction("atan");
                    break;
                case "x^2":
                    performPower(2);
                    break;
                case "x^y":
                    break;
                case "pi":
                    updateDisplay(Double.toString(Math.PI));
                    break;
                case "e":
                    updateDisplay(Double.toString(Math.E));
                    break;
                case "log":
                    performLogarithm("log");
                    break;
                case "ln":
                    performLogarithm("ln");
                    break;
                case "abs":
                    performAbsoluteValue();
                    break;
                case "!":
                    performFactorial();
                    break;
                case "|x|":
                    performAbsoluteValue();
                    break;
                default:
                    updateDisplay(buttonText);
            }
        }

        private void calculateResult() {
            String expression = display.getText();

            display.setText(expression);
        }

        private void clearDisplay() {
            display.setText("");
        }

        private void performTrigFunction(String functionName) {
            String expression = display.getText();

            display.setText(functionName + "(" + expression + ")");
        }

        private void performSquareRoot() {
            String expression = display.getText();

            display.setText("sqrt(" + expression + ")");
        }

        private void performPower(int exponent) {
            String expression = display.getText();

            display.setText(expression + "^" + exponent);
        }

        private void performInverseTrigFunction(String functionName) {
            String expression = display.getText();

            display.setText(functionName + "^(-1)(" + expression + ")");
        }

        private void performLogarithm(String functionName) {
            String expression = display.getText();

            display.setText(functionName + "(" + expression + ")");
        }

        private void performAbsoluteValue() {
            String expression = display.getText();

            display.setText("|" + expression + "|");
        }

        private void performFactorial() {
            String expression = display.getText();

            try {
                int value = Integer.parseInt(expression);
                long result = calculateFactorial(value);

                display.setText(Long.toString(result));
            } catch (NumberFormatException e) {
                display.setText("Invalid input for factorial");
            }
        }

        private long calculateFactorial(int n) {
            if (n < 0) {
                return -1;
            }

            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        }

        private void updateDisplay(String text) {
            display.setText(display.getText() + text);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ScientificCalculatorGUI calculator = new ScientificCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
