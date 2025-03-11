import java.util.Scanner;

// Define the Area class
class Area {
    private double length;
    private double breadth;

    // Method to set dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

// Main class
public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create an Area object
        Area rectangle = new Area();

        // Prompt user for length and breadth
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Set the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}
