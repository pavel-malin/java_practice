import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ListDemo0 implements ListSelectionListener {
    static JList<String> jlist;
    static JLabel jlab;
    static JScrollPane jscrlp;
    static String[] names = {"Him", "Din", "Dan",
                      "Trim", "Moon", "Trina",
                      "Sam", "Sim", "Trisim"};

    ListDemo0() {
        JFrame jfrm = new JFrame("List demonstration");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlist = new JList<String>(names);
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrlp = new JScrollPane(jlist);
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jlab = new JLabel("Choose a name");
        jlist.addListSelectionListener(this);
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le) {
        int[] indices = jlist.getSelectedIndices();
        if (indices.length != 0) {
            String who = "";
            for (int i: indices)
                who += names[i] + " ";
            jlab.setText("Current seletion: " + who);
        }
        else
            jlab.setText("Choose highlight");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo0();
            }
        });
    }
}
