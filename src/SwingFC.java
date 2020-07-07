import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {
    JTextField jtfFirst;
    JTextField jtfSecond;
    JButton jbtnComp;
    JLabel jlabFirst;
    JLabel jlabSecond;
    JLabel jlabResult;

    SwingFC() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 190);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        jtfFirst.setActionCommand("FilesA");
        jtfSecond.setActionCommand("FilesB");
        JButton jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);
        jlabFirst = new JLabel("One file: ");
        jlabSecond = new JLabel("Two file: ");
        jlabResult = new JLabel("");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i=0, j=0;
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("Missing first file name.");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
                    FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            do {
                i = f1.read();
                j = f2.read();
            }
            while (i != -1 && j != -1);
            if (i != j)
                jlabResult.setText("Files are different.");
            else
                jlabResult.setText("Files are the same.");
        }
        catch (IOException exc) {
            System.out.println("File error");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });
    }
}
