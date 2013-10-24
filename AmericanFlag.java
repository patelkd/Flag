public class AmericanFlag {

	private Rectangle stripe;
	private int width;
	private int height;
	private Rectangle union;
	

	//constuction
	public AmericanFlag(int height, int width) {
		setHeight(height);
		setWidth(width);
		draw();
	}

	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;
		}
	}
	public void setLength(int heigh) {
		if (height>0) {
			this.height = height;
		}
	}


	public void draw(int length, int width, Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, width, height);
	}
	
}

//stripe.draw
one fill rect
each object should be able to draw itself