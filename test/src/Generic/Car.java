package Generic;

public class Car implements Comparable<Car>  {

	int price;
	String Colour;
	int Speed;
	
	public Car(int price,int Speed,String Colour) {
		
		this.price=price;
		this.Speed=Speed;
		this.Colour=Colour;
		
	}
	
	@Override
	public String toString() {
		return this.price+" "+this.Speed+" " +this.Colour;
	}

	
	public int compareTo(Car other) {
		return this.price-other.price;
	}
	
	
}
