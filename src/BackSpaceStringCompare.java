import java.util.Stack;

public class BackSpaceStringCompare {
    public static boolean backspaceCompareUsingStack(String s,String t){
        Stack<Character> st1 = backspaceOperation(s);
        Stack<Character> st2 = backspaceOperation(t);
        return st1.equals(st2);
    }
    public static Stack<Character> backspaceOperation(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
             char ch = str.charAt(i);
             if(ch != '#'){
                 stack.push(ch);
             }else if(!stack.isEmpty()){
                 stack.pop();
             }
        }
        return stack;
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean b = backspaceCompareUsingStack(s, t);
        System.out.println(b);
    }
}
