package com.company;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

    public class Clock {

        Toolkit toolkit;
        Timer timer;

        public static void timerDemo(int seconds) {
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           Timer timer = new Timer();
        }

        class RemindTask extends TimerTask {
            public void run() {
                System.out.println("Finit !");
                toolkit.beep();

            }
        }

    }

