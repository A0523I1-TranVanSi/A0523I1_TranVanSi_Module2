package practice;

public class Rectangle extends Shape{
    private double width = 1.0 ;
    private double height = 1.0 ;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width ;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.width) ;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length" + this.height +", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,5.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue",false,3.5,1.5);
        System.out.println(rectangle);
    }
}
