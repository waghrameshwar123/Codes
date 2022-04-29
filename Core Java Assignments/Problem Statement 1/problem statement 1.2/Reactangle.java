import java.util.Scanner;
import java.lang.Math;

class Reactangle{
	
	double length;
	double breadth;
	double area;
	double perimeter;
	double diagonal;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle :");
		length = scan.nextInt();
		System.out.println("Enter the breadth of rectangle :");
		breadth = scan.nextInt();
		
	}
	void calc() {
		
		area = length * breadth ;
		perimeter = 2 * (length + breadth);
		diagonal = Math.sqrt(length*length + breadth*breadth);
	}
	
	void display() {
		System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
        System.out.println("Diagonal of a Rectangle  "+ diagonal);
	}
	
	public static void main(String args[]) {
		Reactangle rectangle = new Reactangle();
		rectangle.input();
		rectangle.calc();
		rectangle.display();
		
	}
		
	
}