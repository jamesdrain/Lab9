
public class Car {
	
	// instance variables
	private String make;
	private String model;
	private int year;
	private double price;
	
	// This is a constructor
	// If you don't create a blank constructor, Java will do it for you
	// unless you add an overloaded constructor, then we need to create a default
	    
	    	
	    public Car() {
	    	
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
		
		public String toString() {
			return make + "   \t" + model + "     \t" + year + " \t$" + price;
		}
	
}



