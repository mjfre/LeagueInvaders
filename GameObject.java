import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	
	void update() {
		x = x+1;
		y = y+1;
	}
	
	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
