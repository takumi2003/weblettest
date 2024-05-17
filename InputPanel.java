import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputPanel extends JPanel {

  private JTextField coefficientField;
  private ImagePanel selectedImage;

  public InputPanel() {
    setLayout(new GridLayout(3, 3));

    coefficientField = new JTextField(10);
    JButton coefficientButton = new JButton("確定");
    coefficientButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String coefficient = coefficientField.getText();
          //何も入力されていなかった時
          if (coefficient == null || coefficient.trim().isEmpty()) {
            ErrorWindow.showError("係数が入力されていません。");
          } else {
            JOptionPane.showMessageDialog(
              InputPanel.this,
              "係数: " + coefficient
            );
          }
        }
      }
    );

    JButton newWindowButton = new JButton("実行");
    newWindowButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String coefficient = coefficientField.getText();
          //何も入力されていなかった時
          if (coefficient == null || coefficient.trim().isEmpty()) {
            ErrorWindow.showError("係数が入力されていません。");
          } else if (selectedImage == null) {
            ErrorWindow.showError("画像が入力されていません。");
          } else {
            JFrame newFrame = new JFrame("出力画面(仮)");
            newFrame.setSize(300, 200);
            newFrame.setLocationRelativeTo(null);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.setVisible(true);
          }
        }
      }
    );

    add(new JLabel("係数:"));
    add(coefficientField);
    add(coefficientButton);
    add(newWindowButton);
  }
}
