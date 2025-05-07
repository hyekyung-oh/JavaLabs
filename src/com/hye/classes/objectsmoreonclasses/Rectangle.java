package com.hye.classes.objectsmoreonclasses;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // 네 개의 생성자
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // 사각형을 이동시키는 메서드
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // 사각형의 면적을 계산하는 메서드
    public int getArea() {
        return width * height;
    }
	
    public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    
}
