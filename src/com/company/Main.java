package com.company;

import java.awt.*;
import javax.swing.*;

class DrawATriangle extends JPanel {
    public void paintComponent(Graphics g) {
        int[] x = {50, 100, 0};
        int[] y = {0, 100, 100};
        g.drawPolygon(x, y, 3);
    }
}

public class Main {


    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Draw a Polygon");
        frame.setPreferredSize(new Dimension(300,200));
        frame.setMinimumSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 200);

        DrawATriangle panel = new DrawATriangle();
        frame.add(panel);
        frame.setVisible(true);
    }
}