package question2;

abstract class Shape {
 public abstract void draw();
}

class Line extends Shape{
	public void draw() {
		System.out.println("This method draws Line");
	}
}

class Rectangle extends Shape{
	 public void draw() {
		System.out.println("This method draws Rectangle");
	}
}

class Cube extends Shape{
	 public void draw() {
		System.out.println("This method draws Cube");
	}
}
class Circle extends Shape{
	 public void draw() {
		System.out.println("This method draws Circle");
	}
}


public class SHAPES_Q5 {
	public static void main(String[] args) {
		Line line=new Line();
		line.draw();
		Circle circle=new Circle();
		circle.draw();
		Cube cube=new Cube();
		cube.draw();
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
	}

}
