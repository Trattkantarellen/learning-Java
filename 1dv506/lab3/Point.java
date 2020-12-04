package 1dv506_lab3;

public class Point {
	//Fält: 
	private int x;
	private int y;
	
	public Point(int initialX, int initialY) {
	x = initialX;
	y = initialY;
	}
	
	public Point(){
		this.moveToXY(0,0);
	}
	//flyttar punkten till nya kordinater: 
	public void moveToXY(int x_in, int y_in) {
		this.x = x_in;
		this.y = y_in;
	}
	
	public String toString() {
	String out =	"(" + this.x + "," + this.y + ")";
		return out;
	}
	// kollar om två punkter har samma position
	public boolean isEqualTo(Point b) {
		if (this.x != b.x){
			return false;
			}
		if (this.y != b.y){ return false;
		}
		return true;
	}
	// Distansen mellan två punkter:
	public double distanceTo(Point b) {
		double out = Math.hypot(Math.abs(this.x - b.x),Math.abs(this.y - b.y));
		return out;
	}
	//Flyttar punkten i x- och y-led:
	public void move(int x_in, int y_in) {
		this.moveToXY(this.x + x_in, this.y + y_in);
	}
}
