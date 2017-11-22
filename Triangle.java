package shape;

public class Triangle extends TwoDShapes {
    private final double triSide; // sides

    public Triangle() {
        this(1);  //defines length of argument/inputs by user 
    }
    public Triangle(double triSide) {
        this.triSide = triSide;
    }
  //override allows subclass to implement a parent class method based on its requirement.
    @Override
    public double area() {
        
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
        double triCalc = (triSide * 3) / 2;
        //gets called in testshape
        return Math.sqrt(triCalc * (triCalc - triSide) * (triCalc - triSide) * (triCalc - triSide));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return triSide * 3; //gets called in testshape
    }
}
