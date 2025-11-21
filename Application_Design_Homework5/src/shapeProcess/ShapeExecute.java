package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Square square = new Square();
		
	       System.out.println();
	        System.out.println("Area of Square");
	        System.out.print("Enter the measure of a side: ");
	        double side = sc.nextDouble();
	        square.calculateArea(side);

	        System.out.println();
	        System.out.println("Area of Rectangle:");
	        System.out.print("Enter the measure of length: ");
	        double length = sc.nextDouble();
	        System.out.print("Enter the measure of breadth: ");
	        double breadth = sc.nextDouble();
	        square.calculateArea(length, breadth);

	        System.out.println();
	        System.out.println("----");
		
		SemiCircle semiCircle = new SemiCircle();
		
		square.printShape();
		square.printRectangle();
		square.printSquare();
		semiCircle.printShape();
		semiCircle.printSemiCircle();
		semiCircle.printCricle();
		;

	}

}