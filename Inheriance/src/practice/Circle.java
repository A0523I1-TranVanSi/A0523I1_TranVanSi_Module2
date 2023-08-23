package practice;

public class Circle extends Shape{
    private double radius = 1.0 ;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius ;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius * Math.PI ;
    }
    public double getPerimeter(){
        return this.radius*2 * Math.PI ;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + this.radius + ", which is a subclass of "+ super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5);
        System.out.println(circle);

        circle = new Circle("white",true,2.5);
        System.out.println(circle);
    }
}
