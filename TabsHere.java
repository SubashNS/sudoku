package sudoku;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TabsHere extends JFrame {
  public TabsHere() throws HeadlessException {
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLayout(new FlowLayout());

    JLabel label1 = new JLabel("<html><body width=''><p>Welcome To The Help Window!!<br>Testing <br> testing </p></body></html>", JLabel.LEFT);
    getContentPane().add(label1);
    setVisible(true);
  }

  public static void main(String[] args) {
  }
}