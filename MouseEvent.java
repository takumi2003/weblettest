import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample { // クラス名を変更

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          createAndShowGUI();
        }
      }
    );
  }

  private static void createAndShowGUI() {
    JFrame frame = new JFrame("マウスクリック座標の取得");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("クリック座標: ");
    frame.add(label);

    frame.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) { // 正しいMouseEventを使用
          int x = e.getX();
          int y = e.getY();
          label.setText("クリック座標: x=" + x + ", y=" + y);
        }
      }
    );

    frame.setVisible(true);
  }
}
