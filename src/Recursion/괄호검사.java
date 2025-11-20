package Recursion;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;

class solution{
    public static boolean isParenthesesValit(String parentheses){
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if( c == '(' || c == '{' || c == '['){
                deque.push(c);
            }else{
                if(deque.isEmpty()){
                    return false;
                }
                Character pop = deque.pop();
                if( c== ')'){
                    if(pop != '('){
                        return false;
                    }
                } else if (c == '}') {
                    if(pop != '{'){
                        return false;
                    }
                }else {
                    if(pop != '['){
                        return false;
                    }
                }


            }

        }
        return deque.isEmpty();
    }


}



public class 괄호검사 {
    public static void main(String[] args) {
        boolean parenthesesValit = solution.isParenthesesValit("{(([])[])[]]}");
        System.out.println(parenthesesValit);
    }
}
