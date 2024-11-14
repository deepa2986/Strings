import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static String removeAdjacentDuplicates(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        for (char c: stack){
            builder.append(c);
        }
        return builder.toString();
    }
    public static void main(String[] args) {

        String s = "abbaca";
        String removeAdjacentDuplicates = removeAdjacentDuplicates(s);
        System.out.println(removeAdjacentDuplicates);
    }
}
