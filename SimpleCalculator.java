import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField display;
    private String currentInput = "";
    private String operator = "";
    private double num1 = 0;

    public SimpleCalculator() {
        // Frame setup
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("\\d")) {
            currentInput += input;
            display.setText(currentInput);
        } else if (input.matches("[+\\-*/]")) {
            if (!currentInput.isEmpty()) {
                num1 = Double.parseDouble(currentInput);
                operator = input;
                currentInput = "";
                display.setText("");
            }
        } else if (input.equals("=")) {
            if (!currentInput.isEmpty() && !operator.isEmpty()) {
                double num2 = Double.parseDouble(currentInput);
                double result = 0;
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": 
                        if (num2 != 0) result = num1 / num2;
                        else {
                            display.setText("Error");
                            currentInput = "";
                            operator = "";
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
                operator = "";
            }
        } else if (input.equals("C")) {
            currentInput = "";
            operator = "";
            num1 = 0;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}