package exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;

    public QuadraticEquation(){

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public  QuadraticEquation(double a , double b , double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }

    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c ;
    }

    public double getRoot1(){
        return (-this.b + Math.pow(this.b*this.b - 4*this.a*this.c , 0.5)) / 2*this.a ;
    }

    public double getRoot2(){
        return (-this.b - Math.pow(this.b*this.b - 4*this.a*this.c , 0.5)) / 2*this.a ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();
        System.out.print("Enter c : ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a , b , c);
        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (delta > 0 ){
            System.out.println("The equation has two roots "+ root1 +" and "+root2);
        }else if (delta == 0 ) {
            System.out.println("The equation has one roots "+ root1 );
        }else {
            System.out.println("The equation has no real roots ");
        }
    }

}
