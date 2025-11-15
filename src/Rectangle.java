public class Rectangle {
	
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10.5, 5.2);


        System.out.println("Area of rectangle: " + rect.calculateArea());
    }
}