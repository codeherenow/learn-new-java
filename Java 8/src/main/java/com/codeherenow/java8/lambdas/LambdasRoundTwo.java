/*
 * Copyright 2014, Ragunath Jawahar (www.codeherenow.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
