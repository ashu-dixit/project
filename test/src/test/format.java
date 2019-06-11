package test;

import java.util.Formatter;

public class format {

	public static void main(String[] args) {
		StringBuilder sbuf = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("PI = %f%n", Math.PI);
		System.out.print(sbuf.toString());

	}

}
