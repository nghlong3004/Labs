package labs05;

public class shape {
	private String color;
	private boolean filled;
	shape(){
		this.color = "red";
		filled = true;
	}
	shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return color;
	}
	
}
