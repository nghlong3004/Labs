package labs05;

public class rectangle extends shape{
	private double weight;
	private double height;
	rectangle(){
		super();
		this.weight = 1;
		this.height = 1;
	}
	rectangle(double weight, double height){
		super();
		this.weight = weight;
		this.height = height;
	}
	rectangle(double weight, double height, String color, boolean filled){
		this.weight = weight;
		this.height = height;
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return (weight + height) * 2;
	}
	public double perimeter() {
		return weight * weight;
	}
}
