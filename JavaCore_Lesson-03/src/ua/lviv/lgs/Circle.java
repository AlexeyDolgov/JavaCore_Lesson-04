package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;
	

	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}


	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
	    return diameter;
	}


	public double circleArea (double diameter) {
		double area = (Math.PI * diameter * diameter) / 4;
		return area;
	}
	
	public double circleLength (double radius) {
		double length = Math.PI * radius * 2;
		return length;
	}

	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}  
		
}
