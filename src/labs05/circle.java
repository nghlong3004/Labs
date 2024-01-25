package labs05;

public class circle extends shape{
	private double radius;
	private final double PI = 3.14;
	circle(){
		super();
		this.radius = 1.0;
	}
	circle(double radius){
		super();
		this.radius = radius;
	}
	circle(double radius, String color, boolean filled){
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return 2* PI * radius;
	}
}
