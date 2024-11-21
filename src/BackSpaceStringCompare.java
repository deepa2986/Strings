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

    public static boolean backSpaceCompare(String s, String t){

        int index_s = s.length() - 1;
        int index_t = t.length() - 1;

        while (index_s >= 0 || index_t >= 0) {
            index_s = nextValidChar(s, index_s);
            index_t = nextValidChar(t, index_t);

            if (index_s >= 0 && index_t >= 0 && s.charAt(index_s) != t.charAt(index_t)) return false;
            if ((index_s >= 0) != (index_t >= 0)) return false;
            index_s--;
            index_t--;
        }

        return true;
    }

    public static int nextValidChar(String str, int index){
        int backSpace = 0;
        while(index >= 0){
            if(backSpace == 0 && str.charAt(index) != '#'){
                break;
            }else if(str.charAt(index) == '#'){
                backSpace++;
            }else backSpace--;
            index--;
        }
        return index;
    }
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean b = backspaceCompareUsingStack(s, t);
        System.out.println(b);

        boolean compare = backSpaceCompare(s, t);
        System.out.println(compare);
    }
}
