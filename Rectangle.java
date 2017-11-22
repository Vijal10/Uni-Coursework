package shape;

public class Rectangle extends TwoDShapes {
    private final double width, height; //sides

    public Rectangle() {
        this(1,1); //defines length of argument/inputs by user 
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
  //override allows subclass to implement a parent class method based on its requirement.
    @Override
    public double area() {
        // A = w * l
        return width * height;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + height);
    }

} 

