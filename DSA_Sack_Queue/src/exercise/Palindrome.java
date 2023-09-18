package exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            stack.push(value);
            queue.add(value);
        }
        System.out.println("stack push : " + stack );
        System.out.println("queue add : " + queue);

        boolean check = false ;
        while (!stack.isEmpty() && !queue.isEmpty()){
            if (stack.pop().equals(queue.remove())){
                System.out.println("This is Palindrome");
                check = true ;
                break;
            }else {
                System.out.println("Is Not Palindrome");
            }
        }
    }
}
