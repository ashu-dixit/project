package Generic;

import java.util.Comparator;

public class CarColourComparater implements Comparator<Car> {

	@Override
	public int compare(Car t, Car o) {
		
		return t.Colour.compareTo(o.Colour);
	}

}
