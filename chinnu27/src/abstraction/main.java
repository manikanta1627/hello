package abstraction;

abstract class Shape {
 
 abstract double area();
}
class Square extends Shape {
	 double side;

	 Square(double side) {
	     this.side = side;
	 }

	 
	 double area() {
	     return side * side;
	 }
	}


class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }


 double area() {
     return length * width;
 }
}






public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Shape sq = new Square(6);
	     Shape rect = new Rectangle(10, 5);

	     
	     System.out.println("Area of Square: " + sq.area());
	     System.out.println("Area of Rectangle: " + rect.area());
	}

}
