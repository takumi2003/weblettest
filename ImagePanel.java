import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

// 画像を表示するラベルを含むパネルを定義するクラス
public class ImagePanel extends JPanel {

  private JLabel imageLabel; // 画像表示ラベル
  private ImageIcon selectedImage; // 選択された画像

  // コンストラクタ
  public ImagePanel() {
    setLayout(new BorderLayout()); // ボーダーレイアウトを設定

    JButton selectButton = new JButton("画像選択"); // 画像選択ボタン
    selectButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          JFileChooser fileChooser = new JFileChooser(); // ファイル選択ダイアログ
          fileChooser.setDialogTitle("Select Image File"); // ダイアログのタイトル設定
          FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Image Files",
            "jpg",
            "jpeg",
            "png",
            "gif"
          );
          fileChooser.setFileFilter(filter); // ファイルフィルターの設定

          int result = fileChooser.showOpenDialog(ImagePanel.this); // ダイアログを表示してファイルを選択
          if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            selectedImage = new ImageIcon(imagePath); // 選択された画像を取得
            imageLabel.setIcon(selectedImage); // 画像を表示
          }
        }
      }
    );

    imageLabel = new JLabel();
    imageLabel.setHorizontalAlignment(JLabel.CENTER);
    imageLabel.setVerticalAlignment(JLabel.CENTER);

    add(selectButton, BorderLayout.NORTH); // 選択ボタンを北側に追加
    add(imageLabel, BorderLayout.CENTER); // 画像ラベルを中央に追加
  }
}
