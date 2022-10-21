import javax.swing.*; 
import java.awt.*;

class DrawingCanvas extends JComponent { 
  public void paintComponent(Graphics gr) {
    Graphics2D g = (Graphics2D) gr;
  // change thickness by:
    g.setStroke(new BasicStroke(5));
    g.drawRect(10,20,40,80);

    g.setColor(Color.GREEN);
    g.fillRect(52, 20, 40, 80);
    g.drawOval(10,20,40,80);

    // can also set color using RGB Values
    g.setColor(new (Color(252, 186, 3));
    g.fillOal(52.20.40.80);

    // Any other polygon needs arrays of points. 
    int[] x = {51, 26, 76};
    int[] y = {100, 150, 150};
    g.setColor(Color.MAGENTA);
    g.fillPolygon(x,y,3);

    g.setColor(Color.BLACK);
//You can combine several lines into one: 
    int[] x2 = {1-, 30, 50, 70 90};
    int[] y2 = {160, 180, 160, 180, 160};
    g.drawPolyline(x2, y2, 5);

    g.drawArc(10, 190, 80, 30, -45, 360);

    g.drawString("Hmm this finna be a yummy sandwich", 40, 280); 
  }
}