package Generic;

import java.util.Comparator;

public class Genericclient {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		String[] sarr = { "hello", "hi", "bye" };

		display(arr);
		display(sarr);
		Car[] carr = new Car[5];

		carr[0] = new Car(10, 200, "black");
		carr[1] = new Car(20, 100, "blue");
		carr[2] = new Car(30, 300, "green");
		carr[3] = new Car(40, 500, "white");
		carr[4] = new Car(50, 400, "yellow");

		display(carr);
		// bubblesort(carr);
		
		bubblesort(carr, new CarSpeedcomparater());
		display(carr);
		LinkedListGneric<Car> ll = new LinkedListGneric<>();

		ll.addfirst(carr[0]);
		ll.addfirst(carr[1]);
		ll.addfirst(carr[2]);
		ll.addfirst(carr[3]);
		ll.addfirst(carr[4]);
		ll.display();
	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}
		System.out.println("------------------------------");
	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if ((arr[j]).compareTo(arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comp) {
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if (comp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}
}
