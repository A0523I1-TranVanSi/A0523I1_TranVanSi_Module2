package exercise;

import java.util.Stack;

public class CheckBracket {
    public static boolean isBracketValid(String string){
        Stack<Character> bStack = new Stack<>() ;
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i) ;
            if ( sym == '('){
                bStack.push(sym);
            }else if ( sym == ')'){
                if (bStack.isEmpty()){
                    return false ;
                } else {
                    char left = bStack.pop()  ;
                    if (left != '(' ){
                        return false ;
                    }
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c) " ;
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a  " ;
        String string3 = "s * (s – a) * (s – b * (s – c)  " ;
        String string4 = "s * (s – a) * s – b) * (s – c)  " ;
        String string5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))  " ;
        System.out.println(isBracketValid(string1));
        System.out.println(isBracketValid(string2));
        System.out.println(isBracketValid(string3));
        System.out.println(isBracketValid(string4));
        System.out.println(isBracketValid(string5));
    }
}
