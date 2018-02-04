package HomeWork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("The area of the triangle according to Heron's formula.");

		double a;
		double c;
		double b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for side №1;");
		a = sc.nextDouble();
		System.out.println("Enter the value for side №2;");
		b = sc.nextDouble();
		System.out.println("Enter the value for side №3;");
		c = sc.nextDouble();
		
		sc.close();

		double p = ((a + b + c) / 2);

		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Area of the triangle =" + s);
	}

}
