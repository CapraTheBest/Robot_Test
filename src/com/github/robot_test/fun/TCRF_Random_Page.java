package com.github.robot_test.fun;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class TCRF_Random_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCRF_Random_Page window = new TCRF_Random_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TCRF_Random_Page() {
		initialize();
	}
	
	public void command() throws InterruptedException, IOException{
		try{
			Robot robot = new Robot();
			robot.setAutoDelay(100);
			Runtime.getRuntime().exec("cmd /c " + "%windir%\\explorer.exe shell:::{3080F90E-D7AD-11D9-BD98-0000947B0257}");
			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SHIFT);			
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_ALT);
			
		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 253, 217);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("RANDOM \n PAGE \n GOOOO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					command();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 24));
	}

}
