package HomeWork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Площадь треугольника по формуле Герона.");
		//System.out.println("Нам дано 3 стороны - 9,12,10.");

		double a;
		double c;
		double b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение для стороны №1;");
		a = sc.nextDouble();
		System.out.println("Введите значение для стороны №2;");
		b = sc.nextDouble();
		System.out.println("Введите значение для стороны №3;");
		c = sc.nextDouble();
		
		sc.close();

		double p = ((a + b + c) / 2);

		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Площадь треугольника =" + s);
	}

}
