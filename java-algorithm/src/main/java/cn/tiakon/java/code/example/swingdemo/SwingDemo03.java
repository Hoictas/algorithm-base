package cn.tiakon.java.code.example.swingdemo;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SwingDemo03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Applet");
        JLabel label = new JLabel("Hi! Boy~");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(1);
            SwingUtilities.invokeLater(() -> label.setText("Hey! I`m back "));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
