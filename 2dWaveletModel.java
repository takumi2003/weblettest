import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Point;

public class 2dWaveletModel {

	private double[][] transformedValues; //二次元ウェーブレット変換した後の値

	private double scalingCoefficient; //二次元スケーリング係数

	private double horizontalWaveletCoefficient; //ウェーブレット展開係数(水平)

	private double verticalWaveletCoefficient; //ウェーブレット展開係数(垂直)

	private double diagonalWaveletCoefficient; //ウェーブレット展開係数(対角)

	private double signalLength; //二次元信号の長さ;

	private double transformedLength; //二次元ウェーブレット変換後の長さ

	// 初期化メソッド。ウェーブレット係数を設定
	public void initialize(double scalingCoefficient, double horizontalWaveletCoefficient, double verticalWaveletCoefficient, double diagonalWaveletCoefficient) {
		this.scalingCoefficient = scalingCoefficient;
        this.horizontalWaveletCoefficient = horizontalWaveletCoefficient;
        this.verticalWaveletCoefficient = verticalWaveletCoefficient;
        this.diagonalWaveletCoefficient = diagonalWaveletCoefficient;
        // 必要に応じて他の初期化処理を追加
	}

	// コンストラクタ。信号の長さを受け取り、初期化を行う
	public void 2dWeveletModel(int signalLength) {
		this.signalLength = signalLength; // 信号の長さを設定
        this.transformedLength = calculateTransformedLength(signalLength); // 変換後の長さを計算
        this.transformedValues = new double[this.transformedLength][this.transformedLength]; // 変換後の値を格納する配列を初期化
	}

	// ウェーブレット変換後の長さを計算するメソッド（仮の計算）
    private int calculateTransformedLength(int length) {
        // ウェーブレット変換後の長さを計算するロジックを追加
        return length; // 仮の値
    }

	// マウスクリック時の処理を行うメソッド
	public void mouseClick(MouseEvent e) {
		Point point = e.getPoint(); // クリックされた位置の座標を取得
		return point;
	}

	// マウスドラッグ時の処理を行うメソッド
	public void mouseDragged(MouseEvent e) {
        Point point = e.getPoint(); // ドラッグされた位置の座標を取得
		return point;
    }

	// ウェーブレット変換結果を取得するメソッド
    public double[][] getTransformedValues() {
        return transformedValues;
    }

}
