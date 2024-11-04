public class Main {
    public static void main(String[] args) {

        // Shape

        Shape s1 = new Shape();
        Shape s2 = new Shape("Blue", false);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println("----------------------------------");

        s1.setColor("Red");
        s1.setFilled(false);
        System.out.println(s1.toString());

        System.out.println("##################################");

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.8);
        Circle c3 = new Circle("Gray", true, 7.5);

        c1.setColor("Yellow");
        c1.setRadius(5.2);
        c2.setColor("Purple");
        c2.setFilled(false);

        System.out.println(c1.toString());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(c2.toString());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = " + c2.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(c3.toString());
        System.out.println("Area = " + c3.getArea());
        System.out.println("Perimeter = " + c3.getPerimeter());

        System.out.println("##################################");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 8);
        Rectangle r3 = new Rectangle("Cyan", true, 3, 9);

        System.out.println(r1.toString());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(r2.toString());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(r3.toString());
        System.out.println("Area = " + r3.getArea());
        System.out.println("Perimeter = " + r3.getPerimeter());

        System.out.println("----------------------------------");

        r1.setColor("Brown");
        r1.setFilled(false);
        r1.setWidth(8);
        r1.setLength(16);

        System.out.println(r1.toString());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println("##################################");

        Square q1 = new Square();
        Square q2 = new Square(5);
        Square q3 = new Square(6, "Silver", false);

        System.out.println(q1.toString());
        System.out.println("Area = " + q1.getArea());
        System.out.println("Perimeter = " + q1.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(q2.toString());
        System.out.println("Area = " + q2.getArea());
        System.out.println("Perimeter = " + q2.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(q3.toString());
        System.out.println("Area = " + q3.getArea());
        System.out.println("Perimeter = " + q3.getPerimeter());

        System.out.println("----------------------------------");

        q1.setColor("Crimson");
        q1.setFilled(false);
        q1.setWidth(3);
        q1.setLength(6);

        System.out.println(q1.toString());
        System.out.println("New Area = " + q1.getArea());
        System.out.println("New Perimeter = " + q1.getPerimeter());

        System.out.println("##################################");

        System.out.println("Trying some exceptions:");

        try {
            Circle c4 = new Circle("Black", true, -5.0);
            System.out.println(c4.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Rectangle r4 = new Rectangle("Orange", false, -10, 5);
            System.out.println(r4.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Rectangle r5 = new Rectangle();
            r5.setLength(-20);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Square s4 = new Square(-7);
            System.out.println(s4.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Shape s3 = new Shape();
            s3.setColor(null);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("----------------------------------");

        System.out.println("Final Shapes:");
        System.out.println(s1.toString());
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(q1.toString());

    }

}
