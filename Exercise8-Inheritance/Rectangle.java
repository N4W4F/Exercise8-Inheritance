public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        if (width < 0 || length < 0)
            throw new IllegalArgumentException("Widh and length cannot be negative.");
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        if (width < 0 || length < 0)
            throw new IllegalArgumentException("Widh and length cannot be negative.");
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0)
            throw new IllegalArgumentException("Width cannot be negative.");
        this.width = width;
    }

    public void setLength(double length) {
        if (length < 0)
            throw new IllegalArgumentException("Length cannot be negative.");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " +
                getLength() + ", which is a subclass of " + super.toString();
    }
}
