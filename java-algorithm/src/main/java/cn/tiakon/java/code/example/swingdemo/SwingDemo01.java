package cn.tiakon.java.code.example.swingdemo;

import javax.swing.*;


public class SwingDemo01 {
    public static void main(String[] args) {

        /**
         *　窗口名称
         *　关闭时退出程序
         *　设置窗口大小
         *　设置窗口是否显示
         * */

        JFrame frame = new JFrame("Java Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
