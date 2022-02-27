package hackerRank;

/**
 * This is a collection of methods we expect and require a polygon to have
 **/
interface Polygon {
	/** @return The number of sides of the Polygon **/
	int getNumberOfSides();

	/** @return The perimeter(cevre) of the Polygon **/
	double getPerimeter();
}

// Ucgen icin
class Triangle implements Polygon {
	private static int numberOfSides = 3;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

// dikdortgen
class Rectangle implements Polygon {
	private static int numberOfSides = 4;
	private double side1;
	private double side2;

	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public double getPerimeter() {
		return side1 + side1 + side2 + side2;
	}
}

/**
 * This inherits the properties and methods of its superclass, Rectangle.
 **/
class Square extends Rectangle implements Polygon {
	public Square(double side) {
		super(side, side);
	}
}

class Solution {
	public static void print(Polygon p) {
		System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
		System.out.println("The perimeter of this shape is: " + p.getPerimeter() + '\n');
	}

	public static void main(String[] args) {
		Polygon triangle = new Triangle(1, 2, 3);
		print(triangle);

		Polygon rectangle = new Rectangle(2, 3);
		print(rectangle);

		Polygon square = new Square(2);
		print(square);

	}
}
/*
 * A Triangle has 3 sides. The perimeter of this shape is: 6.0
 * 
 * A Rectangle has 4 sides. The perimeter of this shape is: 10.0
 * 
 * A Square has 4 sides. The perimeter of this shape is: 8.0
 */
