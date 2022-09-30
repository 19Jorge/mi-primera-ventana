package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        mainPanel.add(
                new JButton("long named button"),
                new GridBagConstraints(0,0,1,1,1.0,4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,0));

        mainPanel.add(
                new JButton("long named button"),
                new GridBagConstraints(1,0,1,1,1.0,4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,0));

        mainPanel.add(
                new JButton("long named button"),
                new GridBagConstraints(2,0,1,1,1.0,4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,0));

        mainPanel.add(
                new JButton("long-Named Button 4"),
                new GridBagConstraints(0,1,3,1,1.0,4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,0));

        mainPanel.add(
                new JButton("5"),
                new GridBagConstraints(1,2,2,1,1.0,4.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,0));

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}

