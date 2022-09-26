package org.iesfm.ventana;

import javax.swing.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        mainPanel.setBorder(BorderFactory.createTitledBorder("Search"));



    }
}
