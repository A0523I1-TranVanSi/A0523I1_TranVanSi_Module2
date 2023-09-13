package exercise;

import java.util.Stack;

public class ReverseArrayStack {
    public static void ReverseArrayByStack(int[] array){
        // tạo 1 stack rỗng với kiểu số
        Stack<Integer> stack = new Stack<>();
        // duyệt mảng để push tường phần tử vào stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]) ;
        }
        // duyệt mảng lấy từng phần tử stack đưa vào lại mảng ban đầu
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
    public static void ReverserStringByStack(String string){
        Stack<String> wStack = new Stack<>();
        String[] word = string.split(" ");
        for (int i = 0; i < word.length; i++) {
            wStack.push(word[i]);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!wStack.isEmpty()){
            String saveWord = wStack.pop();
            reversedString.append(saveWord);
            reversedString.append(" ");
        }
        System.out.println(reversedString.toString());
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        ReverseArrayByStack(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String string = " TRAN VAN SI" ;
        ReverserStringByStack(string);
    }
}
