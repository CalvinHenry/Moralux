import java.awt.Point;

public class Unit {
	int player;
	double x;
	double y;
	Point location;
	
	Point targetLocation;
	
	final int SPEED = 1;
	
	public Unit(int player, Point location){
		this.player = player;
		this.location = location;
		x = location.x;
		y = location.y;
	}
	public Unit(){
		this(0, new Point(100,100));
	}
	public void setTargetLocation(Point location){
		targetLocation = new Point(location.x, location.y);
	}
	public double getAngleToTargetLocation(){
		int dX = location.x - targetLocation.x;
		int dY = location.y - targetLocation.y;
		if(dX == 0){
			
		}
		return dX/dY;
	}
	
}
