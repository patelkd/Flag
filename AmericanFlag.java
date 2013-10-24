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
	public void setLength(int height) {
		if (height>0) {
			this.height = height;
		}
	}


	public void draw(Graphics g) {
		draw.drawLongRectangle();
		draw.drawUnion();
	}

	public static void main(String[] args) {
		Draw draw = new draw();
	}
	
}

//stripe.draw
// one fill rect
// each object should be able to draw itself