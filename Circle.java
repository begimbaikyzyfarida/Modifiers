class Circle {
    private static final double PI = 3.14159;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    static double area(double radius) {
        return PI * (radius * radius);
    }

    static double circumference(double radius) {
        return 2 * PI * radius;
    }
}
