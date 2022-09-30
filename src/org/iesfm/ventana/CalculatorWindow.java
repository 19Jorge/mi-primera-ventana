package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setTitle("Calculadora");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel resulPanel = new JPanel();
        mainPanel.add(resulPanel, BorderLayout.NORTH);
        resulPanel.add(new JTextField(30));

        JPanel buttonsPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        buttonsPanel.add(new JButton("Rtc"));
        buttonsPanel.add(new JButton("Ce"));
        buttonsPanel.add(new JButton("Cl"));
        buttonsPanel.add(new JButton("+/-"));
        buttonsPanel.add(new JButton("7"));
        buttonsPanel.add(new JButton("8"));
        buttonsPanel.add(new JButton("9"));
        buttonsPanel.add(new JButton("+"));
        buttonsPanel.add(new JButton("6"));
        buttonsPanel.add(new JButton("5"));
        buttonsPanel.add(new JButton("4"));
        buttonsPanel.add(new JButton("-"));
        buttonsPanel.add(new JButton("1"));
        buttonsPanel.add(new JButton("2"));
        buttonsPanel.add(new JButton("3"));
        buttonsPanel.add(new JButton("="));

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}