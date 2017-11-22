package shape;

public class Cylinder extends ThreeDShapes {
    
    private final double radius, height;
    
    public Cylinder() {
        this(1,1);//defines length of argument/inputs by user 
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        
                
    }
    //override allows subclass to implement a parent class method based on its requirement.
    @Override
    public double area() {
    
        double cylinA = 2 * Math.PI * (radius * radius); //Step 1 of Cylinder Area calculation
        double cylinB = 2 * Math.PI * radius * height; //Step 2 of Cylinder Area calculation
        return cylinA + cylinB; //add both parts together to get Area answer */
    }

    
    @Override
    public double volume() {
    
    return Math.PI * (radius * radius) * height; //gets called in testshape
}
} 

                                
