package swingdemo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class prob2_swing extends JFrame {
    JFrame f;
    JLabel l,l2;
    JButton b;
    int count;
    prob2_swing() {
        f = new JFrame("button chk");
        l = new JLabel();
        l.setText("Button Count");
        JPanel p = new JPanel();
        p.add(l);

        l2 = new JLabel();
        l2.setText("Press Count -"+count);
        p.add(l2);

        b = new JButton();
        b.setText("Increment");
        b.addActionListener(new ButtonListener());
        p.add(b);

        f.add(p);
        f.setSize(500, 500);

        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // main class
    public static void main(String[] args) {
        new prob2_swing();
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            count++;
            l2.setText("Press Count -"+count);
        }
    }
}
