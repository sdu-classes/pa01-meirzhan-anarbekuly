public class Circle {
    double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        radius= Math.PI*radius*radius;
        return radius;
    }

    public double getCircumference(){
        radius=2*Math.PI*radius;
        return radius;
    }

    public String toString(){
        return "Circle[radius="+radius+"]";
    }

    public static void main(String[] args) {
        Circle c1=new Circle();


        c1.getArea();
        System.out.println(c1);
        c1.getCircumference();
        System.out.println(c1);
    }

}

