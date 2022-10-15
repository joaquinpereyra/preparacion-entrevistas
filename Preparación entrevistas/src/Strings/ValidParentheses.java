package Strings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses{


    public static Boolean validParentheses(String cadena){
        Queue<Character> parentesis = new LinkedList<>();
        Queue<Character> parentesisRecto = new LinkedList<>();
        Queue<Character> parentesisCorchetes = new LinkedList<>();
        for(int i = 0; i < cadena.length(); i++){
            char elem = cadena.charAt(i);

            if(elem == '(' || elem == '{' || elem == '['){

            }else
            {
                
            }

            if(elem == '('){
                parentesis.add(elem);
            }
            if(elem == ')' && !parentesis.isEmpty()){
                parentesis.remove();
            }else if(elem == ')'){
                return false;
            }

            if(elem == '['){
                parentesisRecto.add(elem);
            }
            if(elem == ']' && !parentesisRecto.isEmpty()){
                parentesisRecto.remove();
            }else if(elem == ']'){
                return false;
            }

            if(elem == '{'){
                parentesisCorchetes.add(elem);
            }
            if(elem == '}' && !parentesisCorchetes.isEmpty()){
                parentesisCorchetes.remove();
            }else if(elem == '}'){
                return false;
            }
            
        }
        return parentesis.isEmpty() && parentesisRecto.isEmpty() && parentesisCorchetes.isEmpty();
    }

    public static void main(String[] args) {
        String cadena = "(((())))()()()";
        String input1 = "{{}}()[()]";
        String input2 = "{][}";
        String input3 = ")";
        System.out.println(validParentheses(cadena));
        System.out.println(validParentheses(input1));
        System.out.println(validParentheses(input2));
        System.out.println(validParentheses(input3));
        
    }

}
