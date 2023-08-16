package Exercise;

import java.util.Scanner;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW ;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue" ;

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }

    public String toString() {
        if (on){
            return "Speed : " + this.speed + ", Color :" + this.color+", Radius : "+this.radius+", Fan is on" ;
        }else {
            return "Color :" + this.color+", Radius : "+this.radius+", Fan is off" ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1 : " + fan1.toString());
        System.out.println("Fan 2 : " + fan2.toString());
    }
}

