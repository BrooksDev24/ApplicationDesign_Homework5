package shapePack;

public class Square extends Rectangle {
	public void printSquare() {
		System.out.println("This is square, Subclass of rectangle");
	}
	
	   public void calculateArea(double side) {
	        double area = side * side;
	        System.out.println("RESULT: Area of Square= " + area);
	    }

	    @Override
	    public void calculateArea(double length, double breadth) {
	        super.calculateArea(length, breadth);
	    }

}