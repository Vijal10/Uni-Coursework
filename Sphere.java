package shape;

public class Sphere extends ThreeDShapes {
    private final double radius;
    
    public Sphere() {
        this (1); //defines length of argument/inputs by user 
    }
    public Sphere(double raduis) {
        this.radius = raduis;
        
    }
    //override allows subclass to implement a parent class method based on its requirement.
    @Override
    public double area() {//get Area 
    return 4 * Math.PI * (radius * radius); 
    }

    @Override
    public double volume() {//get volume
    //gets called in testshape
    return (4.0 / 3.0) * Math.PI * (radius * radius * radius); 
    
}
}
    

                                