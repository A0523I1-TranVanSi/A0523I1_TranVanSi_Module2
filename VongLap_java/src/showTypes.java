import java.util.Scanner;

public class showTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles : top-left, top-right, botton-left, botton-right");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

        while (true){
            System.out.print("Enter Number : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    System.out.println("botton-left");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("top-left");
                    for (int i = 5; i >= 1 ; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("botton-right");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= 5 ; j++) {
                            if( j <= 5 - i ){
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("top-right");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = i; j <= 5 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i - 1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4 :
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
