public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative.");
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        if (radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative.");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Radius cannot be negative.");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " +
                super.toString();
    }
}
