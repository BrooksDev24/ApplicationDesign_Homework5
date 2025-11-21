package shapePack;

public class Rectangle extends Shape {
	public void printRectangle() {
		System.out.println("This is a Rectangle, Subclass of Shape.");
		
	}
	
    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("RESULT: Area of Rectangle= " + area);
    }
    
}