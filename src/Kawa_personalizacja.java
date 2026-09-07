import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.Random;

public class Kawa_personalizacja {
    JFrame frame = new JFrame();
    private JPanel panel2;
    public JSlider slider1;
    JLabel label;
    private JProgressBar progressBar1;
    private JButton startbutton;
    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;
    private JButton podbój;
    private JLabel obrazek;
    private JButton button2;
    private JButton destrukcja;
    boolean czy_podboj;
    int value;

    Kawa_personalizacja(String kawa) {
        czy_podboj = false;
        if (kawa == "1") {
            Icon icon = new ImageIcon("src/res/ChatGPT_Image_9_paź_2025__12_59_41-removebg-preview.png");
            obrazek.setIcon(icon);
        } else if (kawa == "2") {
            Icon icon = new ImageIcon("src/res/ChatGPT_Image_9_paź_2025__13_15_51-removebg-preview.png");
            obrazek.setIcon(icon);
        } else if (kawa == "3") {
            Icon icon = new ImageIcon("src/res/ChatGPT_Image_9_paź_2025__13_22_54-removebg-preview.png");
            obrazek.setIcon(icon);
        } else if (kawa == "4") {
            Icon icon = new ImageIcon("src/res/ChatGPT_Image_9_paź_2025__13_06_22-removebg-preview.png");
            obrazek.setIcon(icon);
        }

        kawo_inator p = new kawo_inator(false);
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(panel2);
        frame.setVisible(true);
        // ktora_kawa = liczba.getLiczba();

        progressBar1.setPreferredSize(new Dimension(300, 30));
        progressBar1.setStringPainted(true);

        startbutton.setBorder(new LineBorder(Color.black, 3));
        progressBar1.setBorder(new LineBorder(Color.black, 3));
        podbój.setBorder(new LineBorder(Color.black, 3));
        slider1.setBorder(new LineBorder(Color.black, 3));
        button2.setBorder(new LineBorder(Color.black, 3));
        destrukcja.setBorder(new LineBorder(Color.black, 3));


        Timer timer = new Timer(100, null);
        timer.addActionListener(new ActionListener() {
            int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress < 100) {
                    progress++;
                    progressBar1.setValue(progress);
                    Random rand = new Random();
                    int r = rand.nextInt(255);
                    int g = rand.nextInt(255);
                    int b = rand.nextInt(255);
                    Color color = new Color(r, g, b);
                    label.setForeground(color);
                } else {
                    timer.stop();
                    label.setText("Kawa ożyła! ☕️");
                    podbój.setText("Podbij okręg 3 stanów");
                    podbój.setForeground(Color.cyan);
                    czy_podboj = true;
                }
            }
        });

        startbutton.addActionListener(e -> {
            label.setText("Kawa w trakcie plugawienia...");
            progressBar1.setValue(0);
            timer.start();
        });

//        slider1.setPaintTicks(true);
//        slider1.setPaintLabels(true);
//        slider1.setFont(new Font("Arial", Font.BOLD, 12));

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                value = slider1.getValue();
                if (value == 1) {
                    label_1.setForeground(Color.RED);
                    label_2.setForeground(Color.BLACK);
                    label_3.setForeground(Color.BLACK);
                } else if (value == 3) {
                    label_2.setForeground(Color.RED);
                    label_1.setForeground(Color.BLACK);
                    label_3.setForeground(Color.BLACK);
                } else if (value == 2) {
                    label_3.setForeground(Color.RED);
                    label_2.setForeground(Color.BLACK);
                    label_1.setForeground(Color.BLACK);
                }
            }
        });
        progressBar1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timer.stop();
                label.setText("Degeneracja przerwana");
            }
        });

        button2.addActionListener(e -> {
            kawo_inator kawo = new kawo_inator(true);
            frame.setVisible(false);
            frame.dispose();
        });
        podbój.addActionListener(e -> {
            if (czy_podboj == true) {
                podbój podbój1 = new podbój(value);
            }
        });
        destrukcja.addActionListener(e -> {
            frame.setVisible(false);
            frame.dispose();
            kaboom kaboom = new kaboom();
        });
        System.out.println(p.Ktora_kawa_przekaz(kawa));
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
        panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-11848140));
        slider1 = new JSlider();
        slider1.setBackground(new Color(-7699871));
        slider1.setForeground(new Color(-11848140));
        slider1.setMaximum(3);
        slider1.setMinimum(1);
        slider1.setValue(1);
        panel2.add(slider1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label_1 = new JLabel();
        Font label_1Font = this.$$$getFont$$$("Franklin Gothic Medium", -1, 20, label_1.getFont());
        if (label_1Font != null) label_1.setFont(label_1Font);
        label_1.setForeground(new Color(-1966074));
        label_1.setText("Zła");
        panel2.add(label_1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        progressBar1 = new JProgressBar();
        progressBar1.setBackground(new Color(-14080215));
        progressBar1.setForeground(new Color(-1966074));
        panel2.add(progressBar1, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label = new JLabel();
        Font labelFont = this.$$$getFont$$$("Impact", Font.BOLD, 36, label.getFont());
        if (labelFont != null) label.setFont(labelFont);
        label.setForeground(new Color(-16777216));
        label.setText("Kawa w trakcie plugawienia");
        panel2.add(label, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label_2 = new JLabel();
        Font label_2Font = this.$$$getFont$$$("Franklin Gothic Medium", -1, 20, label_2.getFont());
        if (label_2Font != null) label_2.setFont(label_2Font);
        label_2.setForeground(new Color(-16777216));
        label_2.setText("Poważnie niebezpieczna");
        panel2.add(label_2, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label_3 = new JLabel();
        label_3.setFocusable(true);
        Font label_3Font = this.$$$getFont$$$("Franklin Gothic Medium", -1, 20, label_3.getFont());
        if (label_3Font != null) label_3.setFont(label_3Font);
        label_3.setForeground(new Color(-16777216));
        label_3.setText("Bardzo zła");
        panel2.add(label_3, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        startbutton = new JButton();
        startbutton.setActionCommand("Uruchom kawoinator");
        startbutton.setBackground(new Color(-7699871));
        startbutton.setFocusPainted(false);
        Font startbuttonFont = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, startbutton.getFont());
        if (startbuttonFont != null) startbutton.setFont(startbuttonFont);
        startbutton.setForeground(new Color(-11848140));
        startbutton.setHideActionText(false);
        startbutton.setHorizontalTextPosition(0);
        startbutton.setText("Uruchom kawoinator");
        startbutton.setVerticalTextPosition(3);
        panel2.add(startbutton, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        obrazek = new JLabel();
        obrazek.setIcon(new ImageIcon(getClass().getResource("/res/ChatGPT_Image_9_paź_2025__13_06_22-removebg-preview.png")));
        obrazek.setText("");
        panel2.add(obrazek, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        destrukcja = new JButton();
        destrukcja.setActionCommand("Uruchom kawoinator");
        destrukcja.setBackground(new Color(-7699871));
        destrukcja.setFocusPainted(false);
        Font destrukcjaFont = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, destrukcja.getFont());
        if (destrukcjaFont != null) destrukcja.setFont(destrukcjaFont);
        destrukcja.setForeground(new Color(-1966074));
        destrukcja.setHideActionText(false);
        destrukcja.setHorizontalTextPosition(0);
        destrukcja.setText("AUTODESTRUKCJA");
        destrukcja.setVerticalTextPosition(3);
        panel2.add(destrukcja, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        podbój = new JButton();
        podbój.setActionCommand("button2");
        podbój.setBackground(new Color(-7699871));
        podbój.setFocusPainted(false);
        Font podbójFont = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, podbój.getFont());
        if (podbójFont != null) podbój.setFont(podbójFont);
        podbój.setForeground(new Color(-11848140));
        podbój.setHideActionText(false);
        podbój.setHorizontalTextPosition(0);
        podbój.setLabel("???");
        podbój.setText("???");
        podbój.setVerticalTextPosition(3);
        panel2.add(podbój, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button2 = new JButton();
        button2.setActionCommand("button2");
        button2.setBackground(new Color(-7699871));
        button2.setFocusPainted(false);
        Font button2Font = this.$$$getFont$$$("Arial Black", Font.ITALIC, 18, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setForeground(new Color(-11848140));
        button2.setHideActionText(false);
        button2.setHorizontalTextPosition(0);
        button2.setLabel("Powrót");
        button2.setText("Powrót");
        button2.setVerticalTextPosition(3);
        panel2.add(button2, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
        return panel2;
    }
}
