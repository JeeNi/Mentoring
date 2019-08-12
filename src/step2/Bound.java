package step2;

// BoardEx2

public class Bound {
	private double minX, maxX, minY, maxY;
	
	public Bound(Point p1, Point p2) {
		minX = Math.min(p1.x, p2.x);
		maxX = Math.max(p1.x, p2.x);
		
		minY = Math.min(p1.y, p2.y);
		maxY = Math.max(p1.y, p2.y);
	}
	
	public boolean contains(Point p) {
		if ( minX  <= p.x &&  p.x <= maxX && p.y >= minY && p.y <= maxY) {
			return true;
		}
		
		return false;
	}
}
