import java.awt.*;
import java.applet.*;

public class Rectangle  {

	private int width;
	private int heigth;

	public void drawLongRectangle(Graphics g, int x, int y) {
		g.setColor(Color.red);
		g.fillRect(0,0,width,height);
	}

	public void	drawUnion(Graphics g, int x, int y) {
		g.setColor(Color.blue);
		g.fillRect(0,0,width, height);
	}
}