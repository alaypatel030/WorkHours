package com.com.Github.SalaryCalculator.Logic;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;

import com.com.Github.SalaryCalculator.LogIn.LogIn;

public class SalaryCalculatorMain {

	public static JFrame mainWindow = new JFrame("Salary Calculator");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createMainWindow();
					replaceMainWindowContents(new LogIn());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private void replaceMainWindowContents(LogIn newComponent) {
				// Gets all active Frames - this has been adapted specifically for the TA view
				Frame[] frames = Frame.getFrames();
				// If there is only one active window (i.e. the user is NOT a TA)
				if (frames.length == 1)
				{
					mainWindow.getContentPane().removeAll();
					mainWindow.getContentPane().add(newComponent);
					mainWindow.getContentPane().requestFocusInWindow();
					mainWindow.pack();
				}
				// Else they are a TA and will have multiple windows open
				else
				{
					for (Frame f : frames)
					{
						// Checks to see if the selected frame is the one currently being used, and IS a JFrame
						if (f.isActive() && f instanceof JFrame)
						{
							// Casts the frame to a temporary JFrame object (this is safe because of the instance of check)
							JFrame tempFrame = (JFrame) f;
							// Does the same thing as above, but to the currently active window instead
							tempFrame.getContentPane().removeAll();
							tempFrame.getContentPane().add(newComponent);
							tempFrame.getContentPane().requestFocusInWindow();
							tempFrame.pack();
						}
					}
				}
				
			}
			
		});
	}
		
		/**
		 * Creates the main window with required functionality
		 */
		private static void createMainWindow()
		{
			mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			mainWindow.setPreferredSize(new Dimension(618, 458));
			mainWindow.setResizable(false);

			mainWindow.pack();
			mainWindow.setVisible(true);
			mainWindow.setLocationRelativeTo(null);
		
		
	}
}
