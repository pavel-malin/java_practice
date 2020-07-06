import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
    JLabel jlab;
    ButtonDemo() {
        JFrame jfrm = new JFrame("Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Click");
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        jlab = new JLabel("Click button");
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Released"))
            jlab.setText("Button Released.");
        else
            jlab.setText("Button pressed");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
