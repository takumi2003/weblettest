public class ErrorChecker {

  private ImagePanel selectedImage;
  private InputPanel coefficient; // 'inputPanel' should be 'InputPanel'

  public ErrorChecker(ImagePanel selectedImage, InputPanel coefficient) {
    this.selectedImage = selectedImage;
    this.coefficient = coefficient;
  }

  public boolean isEmpty() {
    String coeff = coefficient.getText(); // Assuming InputPanel has a getText() method to retrieve the text
    if (coeff == null || coeff.trim().isEmpty()) {
      ErrorWindow.showError("係数が入力されていません。");
      return false;
    } else if (selectedImage == null) {
      ErrorWindow.showError("画像が選択されていません。");
      return false;
    } else {
      return true;
    }
  }

  // Setter methods to update selectedImage and coefficient if needed
  public void setSelectedImage(ImagePanel selectedImage) {
    this.selectedImage = selectedImage;
  }

  public void setCoefficient(InputPanel coefficient) {
    this.coefficient = coefficient;
  }
}
