package com.RegistrationForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components
    JLabel nameLabel, userLabel, passLabel;
    JTextField nameField, userField;
    JPasswordField passField;
    JButton registerBtn, resetBtn;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center screen

        // Panel with grid layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBackground(new Color(100, 149, 237)); // Blue color

        // Labels
        nameLabel = new JLabel("Names");
        userLabel = new JLabel("UserName");
        passLabel = new JLabel("Password");

        // Text fields
        nameField = new JTextField();
        userField = new JTextField();
        passField = new JPasswordField();

        // Buttons
        registerBtn = new JButton("Register");
        resetBtn = new JButton("Reset");

        registerBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        // Add components
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(userLabel);
        panel.add(userField);

        panel.add(passLabel);
        panel.add(passField);

        panel.add(registerBtn);
        panel.add(resetBtn);

        add(panel);
        setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerBtn) {
            String name = nameField.getText();
            String username = userField.getText();
            String password = new String(passField.getPassword());

            JOptionPane.showMessageDialog(this,
                    "Registration Successful!\nName: " + name + "\nUsername: " + username);
        } else if (e.getSource() == resetBtn) {
            nameField.setText("");
            userField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
	

	}


