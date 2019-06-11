package Generic;

import java.util.Comparator;

public class CarPricecomparater implements Comparator<Car> {

	@Override
	public int compare(Car t, Car o) {
		return o.price-t.price;
	}

}
