package oops;

public class Area {
	
	double length;
	double breadth;
	
	public Area(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		
		double area = length*breadth;
		System.out.println("Area = "+area);
	}
	public static void main(String[] args) {
		Area a  = new Area(5.6, 9.7);
		a.getArea();
		
	}

}
