package com.Github;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.com.Github.SalaryCalculator.Logic.UserProfile;

public class SalaryCalculatorMain {

	public static JFrame mainWindow = new JFrame("Salary Calculator");

	public static ArrayList<UserProfile> LoggedIn = new ArrayList<UserProfile>();

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Runnable r = new Runnable() {
			@Override
			public void run() {
				initAdminUser();
				createmainWindow();
				replaceMainWindowContents(new GUILogin());
			}
		};
		SwingUtilities.invokeLater(r);
	}

	private static void createmainWindow() {
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainWindow.setPreferredSize(new Dimension(618, 458));
		mainWindow.setResizable(false);

		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setLocationRelativeTo(null);
	}

	private static void initAdminUser() {
		UserProfile admin = new UserProfile("admin", "pass", "Admin", "Group", "Five", UserProfile.ADMIN);
		if (!profiles.hasUser("admin"))
			profiles.addUser(admin);
	}
}