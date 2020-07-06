import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {
        JFrame jfrm = new JFrame("Using a text field ");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");

        JButton jbtnRev = new JButton("Invert");
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);
        jlabPrompt = new JLabel("Enter the text: ");
        jlabContents = new JLabel(" ");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Invert")) {
            String argStr = jtf.getText();
            String reStr = "";
            for (int i=argStr.length()-1; i>=0; i--)
                reStr += argStr.charAt(i);
            jtf.setText(reStr);
        }
        else
            jlabContents.setText("You hit Enter. Text: " + jtf.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable () {
            public void run() {
                new TFDemo();
            }
        });
    }
}

