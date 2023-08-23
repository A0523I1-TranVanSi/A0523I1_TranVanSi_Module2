package practice;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth() ;
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    public void setWidth(double width){
        setSide(getHeight());
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() +", which is a subclass of "+ super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square() ;
        System.out.println(square);

        square = new Square(2.5);
        System.out.println(square);

        square = new Square("black",false,5.5);
        System.out.println(square);
    }
}
