package cn.tiakon.java.code.example.swingdemo;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SwingDemo02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing");
        JLabel label = new JLabel("A Label");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        label.setText("Hey! This is Different");
    }
}
