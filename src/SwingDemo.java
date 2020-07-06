import javax.swing.*;

class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("Application Swing");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Programming interface using Swing");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
