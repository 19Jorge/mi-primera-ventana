package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindows  {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        ButtonGroup osBg = new ButtonGroup();

        JRadioButton linuxRd = new JRadioButton("linux");
        linuxRd.setActionCommand("linux");
        JRadioButton windowsRd = new JRadioButton("windows");
        windowsRd.setActionCommand("windows");
        JRadioButton macRd = new JRadioButton("mac");
        macRd.setActionCommand("mac");

        osBg.add(linuxRd);
        osBg.add(windowsRd);
        osBg.add(macRd);

        mainPanel.add(linuxRd);
        mainPanel.add(windowsRd);
        mainPanel.add(macRd);

        //creacion del label
        JLabel osIconLb = new JLabel();
        //linuxLb.setSize(20,20);
        osIconLb.setIcon(new ImageIcon("linux.png"));
        mainPanel.add(osIconLb);

        //creacion boton ok
        JButton okButton = new JButton("ok");
        mainPanel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = osBg.getSelection().getActionCommand();

                JOptionPane.showMessageDialog(f, "ha seleccioado: " + selected);

                osIconLb.setIcon(new ImageIcon(selected + ".png"));
            }
        });
        mainPanel.add(okButton);

        //añadimos panel principal
        f.setContentPane(mainPanel);
        //forzamos que se pinten todos los componentes
        f.repaint();
        f.revalidate();
    }
}
