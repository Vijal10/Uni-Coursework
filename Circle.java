package shape;

public class Circle extends TwoDShapes {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1); //defines length of argument/inputs by user 
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    //override allows subclass to implement a parent class method based on its requirement.
    @Override 
        public double area() { //get area - calculation
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }
    @Override 
    public double perimeter() { // get perimenter - calculation
        // P = 2πr
        return 2 * pi * radius; //gets called in testshape
    }
}
