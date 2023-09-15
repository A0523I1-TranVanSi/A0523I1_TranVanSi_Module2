package exercise;

import java.util.Scanner;
import java.util.Stack;

public class SwapDecimalToBinary {
    public static String Swap(int Decimal){
        Stack<Integer> stack = new Stack<>() ;
        int quotient = 0 ;
        while (Decimal > 0 ){
            quotient = Decimal % 2 ;
            stack.push(quotient);
            Decimal = Decimal / 2 ;
        }
        String string = "" ;
        while (!stack.isEmpty()){
            string += stack.pop();
        }
        return string ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        System.out.println("Binary : ");
        System.out.println(Swap(decimal));

    }
}
