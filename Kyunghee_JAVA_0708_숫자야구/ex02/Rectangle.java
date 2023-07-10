package ex02;
public class Rectangle {
	private int x; private int y; private int width; private int height;
	
	Rectangle(int _x, int _y, int _width, int _height) {
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height = _height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public int square() {
		return (width * height);
	}
	
	public boolean contains(Rectangle r) {
		if (x < r.x && y < r.y) {
			if ( (x + width) > (r.x + r.width) && (y + height) > (r.y + r.height) ) {
				return true;
			}
		}
		return false;
	}
}
