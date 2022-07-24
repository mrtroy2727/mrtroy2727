package first_prog;

public class Circle {
	
	protected static int number = 0;
	private int radius;
	private int center_x;
	private int center_y;
	
	public Circle(int r, int x, int y) {
		radius = r;
		center_x = x;
		center_y = y;
		number += 1;
	}
	public Circle(int r) {
		radius = r;
		center_x = 0;
		center_y = 0;
		number += 1;
	}		
	public Circle() {
		radius = 1;
		center_x = 0;
		center_y = 0;
		number += 1;
	}
	
	public int getx() {
		return center_x;
	}
	public int setx(int x) {
		this.center_x = x;
		return center_x;
	}
	public int gety() {
		return center_y;
	}
	public int sety(int y) {
		this.center_y = y;
		return center_y;
	}
	public int getr() {
		return radius;
	}
	public int setr(int r) {
		this.radius = r;
		return radius;
	}
	public String toString() {
		String result_string = "amount is " + number; 
		return result_string;
	}
}

