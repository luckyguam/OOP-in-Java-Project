public class Test12 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(); // No-args constructor
        
        System.out.printf("triangle1's width: %d\n", triangle1.getWidth());
        System.out.printf("triangle1's perimeter: %.2f\n", triangle1.perimeter());
        System.out.printf("triangle1's area: %.2f\n", triangle1.area());
        triangle1.draw('*');
        System.out.printf("----------------------------------------\n");

        Triangle triangle2 = new Triangle(5); // Parametrized constructor
        
        System.out.printf("triangle2's width: %d\n", triangle2.getWidth());
        System.out.printf("triangle2's perimeter: %.2f\n", triangle2.perimeter());
        System.out.printf("triangle2's area: %.2f\n", triangle2.area());
        triangle2.draw('+');
        System.out.printf("----------------------------------------\n");
        
        Triangle triangle3 = new Triangle(triangle2); // Copy constructor
        
        System.out.printf("triangle3's width: %d\n", triangle3.getWidth());
        System.out.printf("Is triangle3 rotated? %s\n", triangle3.isRotated()? "Yes": "No");
        System.out.printf("triangle3's perimeter: %.2f\n", triangle3.perimeter());
        System.out.printf("triangle3's area: %.2f\n", triangle3.area());
        triangle3.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("Rotating triangle3...");
        triangle3.rotate();
        System.out.printf("Is triangle3 rotated? %s\n", triangle3.isRotated()? "Yes": "No");
        triangle3.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("Setting the width of triangle3 to 6...");
        triangle3.setWidth(6);
        System.out.printf("triangle3's width: %d\n", triangle3.getWidth());
        triangle3.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.println("Rotating triangle3...");
        triangle3.rotate();
        System.out.printf("Is triangle3 rotated? %s\n", triangle3.isRotated()? "Yes": "No");
        triangle3.draw('^');
        System.out.printf("----------------------------------------\n");

        // Trigger exception
        triangle3.setWidth(0);
    } //end-main
} //end-Test