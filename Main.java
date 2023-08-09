public class Main {
    public static void main(String[] args) {
        double radius = 17.0;
        Circle circle = new Circle(17.0);
        double area = Circle.area(radius);
        double circumference = Circle.circumference(radius);
        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
