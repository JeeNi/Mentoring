package step2;

//BoardEx2

public class Point {
	public int x = 0; 					// �⺻��
	public int y = 0;
	
	public Point() { // ������
		
	}
	
	
	public Point(int x, int y) { // 
		this.x = x;
		this.y = y;
	}
	
    public Point(int a) {
    	this.x = a;
    	this.y = a;
    }
	
	public String toString() {
		return "{x: " + this.x + ", y: " + this.y + " }";
	}
}
