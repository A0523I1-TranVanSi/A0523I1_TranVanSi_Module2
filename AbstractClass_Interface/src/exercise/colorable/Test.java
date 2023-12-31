package exercise.colorable;

import exercise.colorable.Circle;
import exercise.colorable.Rectangle;
import exercise.colorable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3] ;
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                System.out.println(((Circle)shape).getArea());
            }else if (shape instanceof  Rectangle){
                System.out.println(((Rectangle)shape).getArea());
            } else if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }else {
                System.out.println("ERRO!!!!");
            }
        }
    }
}
