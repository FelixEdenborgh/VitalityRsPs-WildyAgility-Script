package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Main {
    public static Robot robot = null;
    public static void main(String[] args) throws IOException, AWTException {
        try{
            robot = new Robot();
        }catch(AWTException e){
            e.printStackTrace();
        }

        while(true){
            Klick(381, 426);
            robot.delay(2500);

            Klick(480, 441);
            robot.delay(2000);

            Klick(402, 315);
            robot.delay(10000);

            Klick(496, 320);
            robot.delay(8000);

            Klick(421, 242);
            robot.delay(10000);

            Klick(167, 441);
            robot.delay(8000);

            Klick(173, 270);
            robot.delay(10000);

            Klick(137, 234);
            robot.delay(10000);
        }

    }
    public static void Klick(int x, int y){
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }
    public static void RKlick(int x, int y){
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(MouseEvent.BUTTON3_MASK);
        robot.mouseRelease(MouseEvent.BUTTON3_MASK);
    }
}