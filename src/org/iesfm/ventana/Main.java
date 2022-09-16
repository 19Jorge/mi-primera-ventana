package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 600, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        f.setContentPane(mainPanel);

        //crear label
        JLabel namelabel = new JLabel("nombre");
        //cambiar el color
        namelabel.setForeground(Color.blue);
        //añadir al panel principal
        mainPanel.add(namelabel);

        //crear text field
        JTextField nameT = new JTextField(10);
        //añadir el text field al panl principal
        mainPanel.add(nameT);

        JButton acceptB = new JButton("Aceptar");
        mainPanel.add(acceptB);

        mainPanel.setBackground(Color.yellow);

        f.repaint();
        f.revalidate();
    }

}
