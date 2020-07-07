import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC0 implements ActionListener {
    JTextField jtfFirst;
    JTextField jtfSecond;
    JButton jbtnComp;
    JLabel jlabFirst;
    JLabel jlabSecond;
    JLabel jlabResult;
    JCheckBox jcbLoc;

    SwingFC0() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 190);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        jtfFirst.setActionCommand("FilesA");
        jtfSecond.setActionCommand("FileB");

        JButton jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);
        jlabFirst = new JLabel("One file ");
        jlabSecond = new JLabel("Two file ");
        jlabResult = new JLabel("");

        jcbLoc = new JCheckBox("Show discrepancy position ");
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcbLoc);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i=0, j=0;
        int count=0;
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("Missing first file name");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Missing second file name");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j)
                    break;
                count++;
            }
            while (i !=-1 && j !=-1);
            if (i != j) {
                if (jcbLoc.isSelected())
                    jlabResult.setText("Files differ starting from position " + count);
                else
                    jlabResult.setText("Files are different");
            }
            else
                jlabResult.setText("Compare files match");
        }
        catch (IOException exc) {
            jlabResult.setText("Error file");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC0();
            }
        });
    }
}
