package com.github.robot_test.fun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TestRobotKeys {

    private Robot robot;

    public static void main(String[] args) throws InterruptedException {
        new TestRobotKeys();
    }

    public TestRobotKeys() throws InterruptedException {
        try {
            robot = new Robot();
            Thread.sleep(1000); 					//Random delay
            robot.setAutoDelay(5); 					//Regulate text writing speed
            robot.keyPress(KeyEvent.VK_WINDOWS); 	//Press the Windows Key to open start 
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(50); 						//Without this delay the code will write too fast and the pc won't recognize the "N"
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_PERIOD); 	//It's the "." 
            robot.keyRelease(KeyEvent.VK_PERIOD);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_X);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_ENTER); 		//The enter key, the one under the Delete key
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(50); 						//Without this delay the code will write too fast 
            robot.keyPress(KeyEvent.VK_P);			//and the pc won't recognize that's writing on the notepad
            robot.keyRelease(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }

}