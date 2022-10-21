import javax.swing.*;
import java.awt.*;

class DrawingCanvas extends JComponent {
	public void paintComponent(Graphics gr) {
		Graphics2D g = (Graphics2D) gr;

		int x[] = {351,343,335,330,354,396,461,516,541,535,518,514,487,441,407,372};
		int y[] = {424,449,456,479,506,528,532,510,474,453,426,401,434,453,459,440};
		int numberofpoints = 16;
		g.setColor(new Color(255, 219, 172));
		g.fillPolygon(x, y, numberofpoints);

	}

}