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
            Thread.sleep(1000);
            robot.setAutoDelay(250);
            //robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            //robot.keyRelease(KeyEvent.VK_ALT);
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }

}