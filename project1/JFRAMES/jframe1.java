package JFRAMES;

import javax.swing.*;

public class jframe1 {

  public static void main(String[] args) {
    JFrame frame = new JFrame("My Swing App");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello from JFrame!");
    frame.add(label);

    frame.setVisible(true);
  }

}
