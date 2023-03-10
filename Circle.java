public class Circle {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        radius = Math.PI * radius * radius;
        return radius;
    }

    public double getCircumference() {
        radius = 1.0;
        radius = 2 * Math.PI * radius;
        return radius;
    }

    public String toString() {
        return radius + "";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();


        c1.getArea();
        System.out.println("Area is " + c1);
        c1.getCircumference();
        System.out.println("Circumference is " + c1);
    }

}
