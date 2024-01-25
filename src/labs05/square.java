package labs05;

public class square extends rectangle{
	square(){
		super();
	}
	square(double side){
		this.setHeight(side);
		this.setWeight(side);
	}
	square(double side, String color, boolean filled){
		this.setHeight(side);
		this.setWeight(side);
		this.setColor(color);
		this.setFilled(filled);
	}
	public void setSide(double side) {
		this.setWeight(side);
		this.setHeight(side);
	}
	public double getSide() {
		return this.getHeight();
	}
}
