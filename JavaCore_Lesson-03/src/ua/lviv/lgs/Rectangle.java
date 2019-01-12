package ua.lviv.lgs;

public class Rectangle {

	private int length;
	private int width;
	
	Rectangle () {
		this.length = 10;
		this.width = 15;
	}
		
	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	
	public int rectArea (int length, int width) {
		int area = length * width;
		return area;
	}
	
	public int rectPerimeter (int length, int width) {
		int perimeter = (length + width ) * 2;
		return perimeter;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
		
}
