import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;

public class kawo_inator {
    JFrame frame = new JFrame();
    private JPanel panel1;
    private JLabel Kawoinator_image;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel machinazla;
    public String kawa;

    kawo_inator(boolean pokaz) {
        frame = new JFrame();
        frame.setSize(1000, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(panel1);
        if (pokaz) {
            frame.setVisible(true);
        }
        button1.setBorder(new LineBorder(Color.black, 3));
        button2.setBorder(new LineBorder(Color.black, 3));
        button3.setBorder(new LineBorder(Color.black, 3));
        button4.setBorder(new LineBorder(Color.black, 3));

        /*
        button2.setBorderPainted(false);
        button3.setBorderPainted(false);
        button4.setBorderPainted(false);

        button1.setBounds(50, 50, 100, 100); // kwadrat = kółko

        button1.setFocusPainted(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setOpaque(false);
        button2.setBounds(50, 50, 100, 100); // kwadrat = kółko

        button2.setFocusPainted(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.setOpaque(false);
        button3.setBounds(50, 50, 100, 100); // kwadrat = kółko

        button3.setFocusPainted(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);
        button3.setOpaque(false);
        button4.setBounds(50, 50, 100, 100); // kwadrat = kółko

        button4.setFocusPainted(false);
        button4.setContentAreaFilled(false);
        button4.setBorderPainted(false);
        button4.setOpaque(false);

*/
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(Color.WHITE); //
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(new Color(138, 130, 97)); // powrót do domyślnego
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button2.setBackground(Color.WHITE); //
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button2.setBackground(new Color(138, 130, 97)); // powrót do domyślnego
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button3.setBackground(Color.WHITE); //
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button3.setBackground(new Color(138, 130, 97)); // powrót do domyślnego
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button4.setBackground(Color.WHITE); //
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button4.setBackground(new Color(138, 130, 97)); // powrót do domyślnego
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                Ktora_kawa("1");
                Kawa_personalizacja kawa_personalizacja = new Kawa_personalizacja(kawa);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                kawa = "2";
                Kawa_personalizacja kawa_personalizacja = new Kawa_personalizacja(kawa);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                kawa = "3";
                Kawa_personalizacja kawa_personalizacja = new Kawa_personalizacja(kawa);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
                kawa = "4";
                Kawa_personalizacja kawa_personalizacja = new Kawa_personalizacja(kawa);
            }
        });


    }

    public void Ktora_kawa(String kawa) {
        this.kawa = kawa;
    }

    public String Ktora_kawa_przekaz(String kawa) {
        return kawa;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-11848140));
        panel1.setEnabled(false);
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 6, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        button2 = new JButton();
        button2.setBackground(new Color(-7699871));
        button2.setFocusPainted(false);
        Font button2Font = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setForeground(new Color(-11848140));
        button2.setHideActionText(false);
        button2.setHorizontalTextPosition(0);
        button2.setIcon(new ImageIcon(getClass().getResource("/res/ChatGPT_Image_9_paź_2025__13_15_51-removebg-preview.png")));
        button2.setText("Kofeina Chaosu");
        button2.setVerticalTextPosition(3);
        panel1.add(button2, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(300, 250), null, new Dimension(300, 250), 0, false));
        Kawoinator_image = new JLabel();
        Kawoinator_image.setIcon(new ImageIcon(getClass().getResource("/res/KAWOINATOR.png")));
        Kawoinator_image.setText("Label");
        panel1.add(Kawoinator_image, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 4, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        button4.setBackground(new Color(-7699871));
        button4.setFocusPainted(false);
        Font button4Font = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, button4.getFont());
        if (button4Font != null) button4.setFont(button4Font);
        button4.setForeground(new Color(-11848140));
        button4.setHorizontalTextPosition(0);
        button4.setIcon(new ImageIcon(getClass().getResource("/res/ChatGPT_Image_9_paź_2025__13_06_22-removebg-preview.png")));
        button4.setText("Pieklolatte");
        button4.setVerticalTextPosition(3);
        panel1.add(button4, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(300, 250), null, new Dimension(300, 250), 0, false));
        button1 = new JButton();
        button1.setBackground(new Color(-7699871));
        button1.setBorderPainted(true);
        button1.setContentAreaFilled(true);
        button1.setDefaultCapable(true);
        button1.setEnabled(true);
        button1.setFocusPainted(false);
        button1.setFocusable(false);
        Font button1Font = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setForeground(new Color(-11848140));
        button1.setHorizontalAlignment(0);
        button1.setHorizontalTextPosition(0);
        button1.setIcon(new ImageIcon(getClass().getResource("/res/ChatGPT_Image_9_paź_2025__12_59_41-removebg-preview.png")));
        button1.setRequestFocusEnabled(true);
        button1.setRolloverEnabled(true);
        button1.setText("Zielona Kapuczyna");
        button1.setVerifyInputWhenFocusTarget(true);
        button1.setVerticalAlignment(0);
        button1.setVerticalTextPosition(3);
        button1.setVisible(true);
        panel1.add(button1, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(300, 250), null, new Dimension(300, 250), 0, false));
        button3 = new JButton();
        button3.setBackground(new Color(-7699871));
        button3.setBorderPainted(true);
        button3.setContentAreaFilled(true);
        button3.setDefaultCapable(true);
        button3.setEnabled(true);
        button3.setFocusPainted(false);
        button3.setFocusable(true);
        Font button3Font = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, button3.getFont());
        if (button3Font != null) button3.setFont(button3Font);
        button3.setForeground(new Color(-11848140));
        button3.setHideActionText(false);
        button3.setHorizontalTextPosition(0);
        button3.setIcon(new ImageIcon(getClass().getResource("/res/ChatGPT_Image_9_paź_2025__13_22_54-removebg-preview.png")));
        button3.setText("Czarna Groza");
        button3.setVerticalTextPosition(3);
        panel1.add(button3, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(300, 250), null, new Dimension(300, 250), 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
