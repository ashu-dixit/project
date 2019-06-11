package l_2_17_19;

public class DSclient {

	public static void main(String[] args) throws Exception {

		DynamicStack ds = new DynamicStack();

		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		System.out.println(ds.pop());
		ds.push(50);
		ds.push(60);
		ds.push(70);
		System.out.println(ds.pop());
		ds.push(80);
		ds.push(90);

		DynamicStack nds = new DynamicStack();

		ds.display();

		System.out.println("---------------------");

		// displayreverse(ds);

		System.out.println();

		System.out.println("---------------------");
		actualreverse(ds, nds);

		ds.display();

		System.out.println("---------------------");

		int[] arr = { 50, 20, 30, 40, 45, 60, 70 };

		nextgreaternumber(arr);

		System.out.println("----------------------");

		int[] ans = nextgreaterinorder(arr);

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " <- " + ans[i]);
		}

		System.out.println("----------------------");
		int[] ar= {100,20,30,90,60,50,70,80,120,110,50};
		ans = stockspan(ar);

		for (int val : ans) {
			System.out.println(val);
		}

	}

	public static void displayreverse(DynamicStack ds) throws Exception {
		if (ds.isempty()) {
			return;
		}

		int a = ds.pop();

		displayreverse(ds);
		System.out.print(a + " ");
		ds.push(a);

	}

	public static void actualreverse(DynamicStack ds, DynamicStack hds) throws Exception {
		if (ds.isempty()) {
			if (hds.isempty()) {
				return;
			}
			int temph = hds.pop();
			actualreverse(ds, hds);

			ds.push(temph);

			return;
		}

		int a = ds.pop();
		hds.push(a);
		actualreverse(ds, hds);

	}

	public static void nextgreaternumber(int[] arr) throws Exception {
		DynamicStack ds = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {

			while (!ds.isempty() && ds.peek() < arr[i]) {
				System.out.println(ds.pop() + " <- " + arr[i]);
			}
			ds.push(arr[i]);
		}
		while (!ds.isempty()) {
			System.out.println(ds.pop() + " <- " + -1);
		}
	}

	public static int[] nextgreaterinorder(int[] arr) throws Exception {

		DynamicStack ds = new DynamicStack();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!ds.isempty() && arr[ds.peek()] < arr[i]) {
				ans[ds.pop()] = arr[i];
			}

			ds.push(i);
		}
		while (!ds.isempty()) {
			ans[ds.pop()] = -1;
		}
		return ans;
	}

	public static int[] stockspan(int[] arr) throws Exception {

		DynamicStack ds = new DynamicStack();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!ds.isempty() && arr[ds.peek()] < arr[i]) {
				ds.pop();
			}

			if (ds.isempty()) {
				ans[i] = i + 1;
			} else
				ans[i] = i - ds.peek();
			ds.push(i);
		}
		return ans;
	}
}
