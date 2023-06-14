package org.example.UI;

import org.example.Connection;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        super("Etat de Forme");
        setBounds(0,0, 600, 600);

        Container cp = this.getContentPane();

        double monotonie = 1.9;
        int contrainte = 5900;
        double RCA = 1.0;

        JPanel formPanel = new JPanel(new GridLayout(3, 2));


        if (monotonie < 2 && contrainte < 6000 && RCA > 0.8 && RCA < 1.3 ) {
            JLabel Good = new JLabel("Entrainement optimal");
            JPanel greenPanel = createColorPanel(Color.GREEN);
            formPanel.add(Good);
            formPanel.add(greenPanel);
        } else if (monotonie > 2 && monotonie < 2.5 || contrainte > 6000 && contrainte < 10000) {
            JLabel Warning = new JLabel("Etat de Fatigue");
            JPanel orangePanel = createColorPanel(Color.ORANGE);
            formPanel.add(Warning);
            formPanel.add(orangePanel);
        } else if (monotonie > 2.5 || contrainte > 10000 || RCA > 1.5 ) {
            JLabel Stop = new JLabel("Attention ! Risque de blessure");
            JPanel redPanel = createColorPanel(Color.RED);
            formPanel.add(Stop);
            formPanel.add(redPanel);
        }






        //On ajoute les composants légers au container
        cp.add(formPanel, BorderLayout.LINE_START);

        setVisible(true);
    }

    private JPanel createColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {

        JFrame frame = new Window();
    }
}
