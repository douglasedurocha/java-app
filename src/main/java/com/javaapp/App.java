package com.javaapp;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel label = new JLabel("Versão 1.0.0");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
} 