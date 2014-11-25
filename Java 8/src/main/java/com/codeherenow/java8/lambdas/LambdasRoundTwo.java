package com.codeherenow.java8.lambdas;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class LambdasRoundTwo {
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

        /*
         * If there is only one method parameter, you can skip the
         * enclosing parentheses ().
         */
        // Action listener
        exitButton.addActionListener(e -> jFrame.dispose());

        /*
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });
        */

        /*
         * If the functional interface has a no-arg abstract method,
         * then you have to use a set of empty parentheses ().
         */
        // Show
        SwingUtilities.invokeLater(() -> jFrame.setVisible(true));

        /*
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                jFrame.setVisible(true);
            }
        });
        */
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
