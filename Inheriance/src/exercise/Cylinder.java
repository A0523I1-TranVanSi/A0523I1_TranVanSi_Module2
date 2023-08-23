package exercise;

public class Cylinder extends Circle{
    private double height ;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getRadius()*2*Math.PI*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder { height : "+height +" and Volume : "+ getVolume()+" }"+
                super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(5.5,"red",2.5);
        System.out.println(cylinder);
    }
}
