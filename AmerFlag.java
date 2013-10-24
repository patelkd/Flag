import java.awt.Graphics;
public class AmerFlag {
	private AmerFlag drawAlg;
	Graphics graphics;
	int x,y;
	String shape = "default";

	public AmerFlag (Graphics g, String name, int x, int y) {
		graphics=g;
		shape=name;
		this.x=x;
		this.y=y;
	}

	public void setDrawAlgorithm(AmerFlag da) {
		drawAlg=da;
	}

	public void drawIt() {
		drawAlg.draw(graphics, x, y);
		System.out.println("drawing unit: " + shape);
	}
}