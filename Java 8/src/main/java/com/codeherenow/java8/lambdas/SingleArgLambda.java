package com.codeherenow.java8.lambdas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class SingleArgLambda {
    static final int WIDTH = 400;
    static final int HEIGHT = 80;

    public static void main(String[] args) {
        // JFrame
        final JFrame jFrame = createJFrame();

        // Panel and buttons
        JPanel rootPanel = new JPanel();
        JButton exitButton = new JButton("Exit");
        rootPanel.add(exitButton);

        // Add panel to JFrame
        jFrame.add(rootPanel);

        // Action listener
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });

        // Show
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jFrame.setVisible(true);
            }
        });
    }

    private static JFrame createJFrame() {
        JFrame jFrame = new JFrame("Single Arg Lambda");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(WIDTH, HEIGHT);

        // Center on screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenX = (screenSize.width - WIDTH) / 2;
        int screenY = (screenSize.height - HEIGHT) / 2;
        jFrame.setLocation(screenX, screenY);

        return jFrame;
    }

}
