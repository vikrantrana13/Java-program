import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JLabel messageLabel;

    public RegistrationForm() {
        frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(6, 2));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        registerButton = new JButton("Register");
        messageLabel = new JLabel("");

        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(new JLabel("Password:"));
        frame.add(passwordField);
        frame.add(new JLabel("Confirm Password:"));
        frame.add(confirmPasswordField);
        frame.add(registerButton);
        frame.add(messageLabel);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (name.isEmpty()) {
                    messageLabel.setText("Name cannot be empty.");
                } else if (email.isEmpty() || !email.contains("@")) {
                    messageLabel.setText("Enter a valid email.");
                } else if (password.isEmpty()) {
                    messageLabel.setText("Password cannot be empty.");
                } else if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match.");
                } else {
                    messageLabel.setText("Registration Successful!");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}