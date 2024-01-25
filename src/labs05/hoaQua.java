package labs05;

public class hoaQua {
	// gia ban, so luong, can nang
	private int price, quantity, weight;
	// nguon goc, ngay xuat xu
	private String roots, dateAdded;
	// trang thai cua qua cam
	public String ripe;
	// cac ham getter va setter cua cac thuoc tinh o dang private
	public hoaQua() {
		this.price = 0;
		this.quantity = 0;
		this.weight = 0;
		this.roots = "Unknown";
		this.dateAdded = "Unknown";
	}
	public hoaQua(int price, int weight, int quantity, String roots, String dateAdded, String ripe) {
		this.ripe = ripe;
		this.setDateAdded(dateAdded);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setRoots(roots);
		this.setWeight(weight);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getRoots() {
		return roots;
	}
	public void setRoots(String roots) {
		this.roots = roots;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	
}
