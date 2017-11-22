package shape;

import java.util.*;
import java.io.*;
import static javafx.application.Application.launch;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.net.*;

public class TestShape {

    private static DecimalFormat df = new DecimalFormat(".##"); //rounds all output decimal numbers up

    public static void main(String[] args) {

        df.setRoundingMode(RoundingMode.UP);

        double width;
        double height;
        double radius;
        double triSide;

        System.out.println("Please enter a number beetween 1 and 3\n"); //menu creation
        System.out.println("1 = Two D Shapes");
        System.out.println("2 = Three D Shapes");
        System.out.println("3 = Exit\n ");

        Scanner scan = new Scanner(System.in); //looks for and takes user input

        loop:
        while (true) { //loop positioned allows flexibility of user decisions
            int decision = scan.nextInt(); //user input will be in the form of integers
            switch (decision) { //selection based user input

                case 1:
                    System.out.println("Please select a Two D Shape"); //sub menu
                    System.out.println("r = Rectangle");
                    System.out.println("c = Circle");
                    System.out.println("t = Equalatrial Triangle\n");

                    while (true) {
                        String choice = scan.next(); //user input will be in the form of a string
                        switch (choice) {

                            case "r":
                                //Rectangle
                                System.out.println("\nYou selected Rectangle");

                                System.out.println("\nEnter Rectangle Height: ");
                                height = scan.nextDouble();//reads user input for retangle height

                                System.out.println("Enter Rectangle Width: ");
                                width = scan.nextDouble();//reads user input for retangle width

                                TwoDShapes rectangle = new Rectangle(width, height);//get width and height from Rectangle class

                                //outputs the answers based on the calculations in rectangle 
                                System.out.println("Rectangle width: " + width + " and height: " + height
                                        + "\nRectangle Area: " + df.format(rectangle.area())
                                        + "\nrRectangle Perimeter: " + df.format(rectangle.perimeter()) + "\n");

                                break loop;

                            case "c":
                                // Circle 
                                System.out.println("You selected Circle");

                                System.out.println("Enter Circle Radius: ");
                                radius = scan.nextDouble(); //reads the user input for circle radius 

                                TwoDShapes circle = new Circle(radius);

                                System.out.println("Circle radius: " + radius
                                        + "\nCircle Area: " + df.format(circle.area())
                                        + "\nCircle Perimeter: " + df.format(circle.perimeter()) + "\n");

                                break loop;

                            case "t":
                                // Triangle 
                                System.out.println("\nYou selected Equalatrial Triangle");

                                System.out.println("Enter Triangle length to represent all 3 sides: ");
                                triSide = scan.nextDouble(); // get user input for triangle length
                                TwoDShapes triangle = new Triangle(triSide);

                                //print out Perimeter and Area
                                System.out.println("Triangle Length: " + triSide
                                        + "\nTriangle perimeter is: " + df.format(triangle.perimeter())
                                        + "\nTriangle Area: " + df.format(triangle.area()));

                                break loop;

                        }
                        break loop;

                    }

                case 2:
                    System.out.println("Select a Three D Shape by typing s or y"); //submenu
                    System.out.println("s = Sphere");
                    System.out.println("y = Cyliner\n");

                    while (true) {
                        String selection = scan.next(); //user input will be in the form of a string
                        switch (selection) {

                            case "y":
                                //Cylinder
                                System.out.println("\nYou selected Cylinder");

                                System.out.println("Enter Cylinder Radius: ");
                                radius = scan.nextDouble(); //reads user input for Cylinder Radius

                                System.out.println("Enter Cylinder Height: ");
                                height = scan.nextDouble(); //reads user input for Cylinder Height
                                ThreeDShapes cylinder = new Cylinder(radius, height);

                                System.out.println("Cylinder Radius: " + radius + "Cylinder Height: " + height
                                        + "\nCylinder Volume: " + df.format(cylinder.volume())
                                        + "\n Cylinder Area: " + df.format(cylinder.area()));

                                break loop;

                            case "s":
                                // Decision 9 Sphere
                                System.out.println("\nYou selected Sphere");

                                System.out.println("Enter Sphere Radius: ");
                                radius = scan.nextDouble();
                                ThreeDShapes sphere = new Sphere(radius);

                                System.out.println("Sphere Radius: " + radius
                                        + "\nSphere Volume: " + df.format(sphere.volume())
                                        + "\n Sphere Area: " + df.format(sphere.area()));

                                break;

                            default:
                                // if letter not defined is entered then it asks user for input again
                                System.out.println("Wrong letter. Try again. Select a Three D Shape by typing s or y");
                                break loop;

                        }
                        break loop;
                    }
                case 3:
                    // Exit
                    System.out.println("You decided to Exit");
                    //Exit program
                    System.exit(0);

                    break loop;
                default:
                    // if number not defined is entered then it asks user for input again
                    System.out.println("Wrong number. Please enter a number beetween 1 and 3\n");
                    break loop;
            }
        }
    }
}
