package labs03_3;

public class GrandFather extends Person {
	// constructor
	public GrandFather(String name, String address, int age, double height, double weight, double gender)
	{
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setHeight(height);
		this.setWeight(weight);
		this.setGender(gender);
	}
	// Hien thi ra man hinh console
	public void display()
	{
		System.out.println("GrandFather :");
		System.out.println(this.getName());
		System.out.println(this.getAddress());
		System.out.println(this.getAge());
		System.out.println(this.getHeight());
		System.out.println(this.getWeight());
		System.out.println(this.getGender());
	}
	
}
