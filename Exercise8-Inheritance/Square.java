public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        if (side < 0)
            throw new IllegalArgumentException("Side length cannot be negative.");
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        if (side < 0)
            throw new IllegalArgumentException("Side length cannot be negative.");
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() +
                ", which is a subclass of " + super.toString();
    }
}
