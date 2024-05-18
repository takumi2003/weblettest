import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Point;

public class 1dWaveletModel implements MouseListener{

	private Integer transformedValues; //一次元ウェーブレット変換した後の値

	private double scalingCoefficient; //一次元スケーリング係数

	private double waveletCoefficient; //ウェーブレット展開係数

	private int signalLength; //一次元信号の長さ

	private int transformedLength; //一次元ウェーブレット変換後の長さ

	// 初期化メソッド
	public void initialize(double scalingCoefficient, double waveletCoefficient) {
		this.scalingCoefficient = scalingCoefficient;
        this.waveletCoefficient = waveletCoefficient;
        // 必要に応じて他の初期化処理を追加
	}

	public void 1dWaveletModel(int signalLength) {
		this.signalLength = signalLength;
        this.transformedLength = calculateTransformedLength(signalLength);
        this.transformedValues = new double[this.transformedLength];
	}

	// ウェーブレット変換後の長さを計算するメソッド（仮の計算）
    private int calculateTransformedLength(int length) {
        // ウェーブレット変換後の長さを計算するロジックを追加
        return length;  // 仮の値
    }

	// マウスクリック時の処理を行うメソッド
	public void mouseClick(MouseEvent e) {
		Point point = e.getPoint();
		return point;
	}

	// マウスドラッグ時の処理を行うメソッド
	public void mouseDragged(MouseEvent e) {
        Point point = e.getPoint();
		return point;
    }

	// ウェーブレット変換結果を取得するメソッド
    public double[] getTransformedValues() {
        return transformedValues;
    }

}
