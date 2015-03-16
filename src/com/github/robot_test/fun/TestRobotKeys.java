package com.github.robot_test.fun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRobotKeys extends Thread {

	private Robot robot;

	public static void main(String[] args) throws InterruptedException {
		new TestRobotKeys().start();
	}
	
	@Override
	public void run() {
		try {
			robot = new Robot();
			//            Thread.sleep(1000); 					//Random delay
			//            robot.setAutoDelay(10); 					//Regulate text writing speed
			//            robot.keyPress(KeyEvent.VK_WINDOWS); 	//Press the Windows Key to open start 
			//            robot.keyPress(KeyEvent.VK_R);
			//            robot.keyRelease(KeyEvent.VK_R);
			//            robot.keyRelease(KeyEvent.VK_WINDOWS);
			//            Thread.sleep(50); 						//Without this delay the code will write too fast and the pc won't recognize the "N"
			//            robot.keyPress(KeyEvent.VK_N);
			//            robot.keyRelease(KeyEvent.VK_N);
			//            robot.keyPress(KeyEvent.VK_O);
			//            robot.keyRelease(KeyEvent.VK_O);
			//            robot.keyPress(KeyEvent.VK_T);
			//            robot.keyRelease(KeyEvent.VK_T);
			//            robot.keyPress(KeyEvent.VK_E);
			//            robot.keyRelease(KeyEvent.VK_E);
			//            robot.keyPress(KeyEvent.VK_P);
			//            robot.keyRelease(KeyEvent.VK_P);
			//            robot.keyPress(KeyEvent.VK_A);
			//            robot.keyRelease(KeyEvent.VK_A);
			//            robot.keyPress(KeyEvent.VK_D);
			//            robot.keyRelease(KeyEvent.VK_D);
			//            robot.keyPress(KeyEvent.VK_PERIOD); 	//It's the "." 
			//            robot.keyRelease(KeyEvent.VK_PERIOD);
			//            robot.keyPress(KeyEvent.VK_E);
			//            robot.keyRelease(KeyEvent.VK_E);
			//            robot.keyPress(KeyEvent.VK_X);
			//            robot.keyRelease(KeyEvent.VK_X);
			//            robot.keyPress(KeyEvent.VK_E);
			//            robot.keyRelease(KeyEvent.VK_E);
			//            robot.keyPress(KeyEvent.VK_ENTER); 		//The enter key, the one under the Backspace key
			//            robot.keyRelease(KeyEvent.VK_ENTER);
			//            Thread.sleep(50); 						//Without this delay the code will write too fast 
			//and the pc won't recognize that's writing on the notepad

			String line;
			String pidInfo = "";

			while(true) {
				Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");

				BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));

				while ((line = input.readLine()) != null) {
					pidInfo += line; 
				}

				input.close();

				if(pidInfo.contains("notepad.exe")) {	// Check if noteoad.exe is running TODO: CHANGE TO WHILE FOR TH JAR, IT'S FASTER AND MORE DEADFUL
					robot.setAutoDelay(0);
					robot.keyPress(KeyEvent.VK_P);			
					robot.keyRelease(KeyEvent.VK_P);
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
					robot.keyPress(KeyEvent.VK_M);
					robot.keyRelease(KeyEvent.VK_M);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyPress(KeyEvent.VK_SPACE);
					robot.keyRelease(KeyEvent.VK_SPACE);
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_P);
					robot.keyPress(KeyEvent.VK_U);
					robot.keyRelease(KeyEvent.VK_U);
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}
			}

		} catch (AWTException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}