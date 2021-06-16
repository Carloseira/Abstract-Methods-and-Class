package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enther the number of shapes: ");
		int n = input.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = input.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED) ? ");
			input.nextLine();
			Color color = Color.valueOf(input.next());
			if (answer == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = input.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("-------SHAPE AREAS-------");
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		
		input.close();
	}

}
