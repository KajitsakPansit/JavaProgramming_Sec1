public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	public Rectangle2(double width,double length) {
		this.width=width;
		this.length=length;
	}
	@Override
	public double getArea() {
		return 0;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public String toSring() {
		return "Rectangle[width ="+this.width+",length = "+this.length;
	}
}
