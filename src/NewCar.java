
public class NewCar {

	private String make;
	private String model;
	private int year;
	private double price;
	
	
	public NewCar() {
		
		super();
		
		
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public NewCar(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
		
	}
	
	@Override
	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-8s $%4$,-10.2f\n", make, model, year, price);
	}
	
}
	

