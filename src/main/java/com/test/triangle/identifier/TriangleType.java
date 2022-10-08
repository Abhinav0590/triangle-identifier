package com.test.triangle.identifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TriangleType {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("enter the sides");

		a = input.nextInt();
		
		b = input.nextInt();
		
		c = input.nextInt();

		System.out.println(getTriangleType(a, b, c));
	}

	public static String getTriangleType(int a, int b, int c) {

		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Is a Triangle");
			if (a == b && b == c)
				return "equilateral";
			else if (a == b || b == c || c == a)
				return "isosceles";
			else
				return "scalene";
		}
		return "Not a Triangle";
	}

}
