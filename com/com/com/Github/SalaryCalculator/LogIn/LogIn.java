package com.com.Github.SalaryCalculator.LogIn;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LogIn extends JPanel {
	private JPasswordField passwordField;
	private JTextField textField;

	// Create the login screen panel.
	public LogIn() {
		setBounds(0, 0, 618, 458);
		setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(228, 239, 146, 20);
		add(passwordField);

		textField = new JTextField();
		textField.setBounds(228, 198, 146, 20);
		add(textField);
		textField.setColumns(10);

		JLabel lblWelcomeToSalary = new JLabel("Welcome to Salary Calculator");
		lblWelcomeToSalary.setBounds(216, 74, 268, 14);
		add(lblWelcomeToSalary);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(228, 180, 146, 14);
		add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(228, 224, 146, 14);
		add(lblPassword);

		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(228, 283, 146, 23);
		add(btnNewButton);

		JLabel lblForgotPassword = new JLabel("Forgot Password?");
		lblForgotPassword.setBounds(270, 258, 146, 14);
		add(lblForgotPassword);
	}
}
