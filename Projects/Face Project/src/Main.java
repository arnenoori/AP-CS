import javax.swing.*;
import java.awt.*;

class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("This is my wonderful frame title.");
		DrawingCanvas canvas = new DrawingCanvas();
		canvas.setPreferredSize(new Dimension(798, 570));
		frame.add(canvas);
		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}