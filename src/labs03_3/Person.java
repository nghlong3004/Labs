package labs03_3;

public class Person {
	// cac thuoc tinh cua doi tuong
	private String name, address;
	private int age;
	private double height, weight;
	private double gender;
	// cac ham setter, getter cua doi tuong
	public String getName() {
		return name;
	}
	public double getGender() {
		return gender;
	}
	public void setGender(double gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
