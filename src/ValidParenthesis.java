import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidParenthesis(String s){
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                charStack.push(ch);
            }else if(!charStack.isEmpty()
                    && ((ch == '}' && charStack.peek() == '{')
                    || (ch == ')' && charStack.peek() == '(')
                    || (ch == ']' && charStack.peek() == '['))){
                charStack.pop();
            }
            else charStack.push(ch);
        }
        return charStack.isEmpty() ? true : false;
    }
    public static void main(String[] args) {

        String s = "{([())]}";
        boolean isValid = isValidParenthesis(s);
        System.out.println(isValid);
    }
}
