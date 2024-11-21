import java.util.Stack;

public class ValidParenthesisII {

    public static boolean isValid(String s){
        Stack<Integer> pair = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                pair.push(i);
            }else if(ch == '*'){
                star.push(i);
            }else{
                if(!pair.isEmpty()){
                    pair.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else return false;
            }
        }
        return isBalanced(pair,star);
    }

    private static boolean isBalanced(Stack<Integer> pair, Stack<Integer> star) {
        while (!pair.isEmpty()){
           if(star.isEmpty()){
               return false;
           }else if(star.peek() > pair.peek()){
               pair.pop();
               star.pop();
           }else return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "(**))))";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
