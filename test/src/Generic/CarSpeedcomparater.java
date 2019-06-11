package Generic;

import java.util.Comparator;

public class CarSpeedcomparater implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		
		return t.Speed-o.Speed;
	}

	 

}
