import java.util.Stack;

public class ReverseString {

    public static String reverseUsingRecursion(String s){
        if(s == null || s.length() <= 1){
            return s;
        }
        return reverseUsingRecursion(s.substring(1)) + s.charAt(0);
    }

    public  static String reverseString(String s){
        char[] strArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            char temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
        return new String(strArray);
    }

    public static void reverseStringUsingStack(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            stack.push(ch);
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }

    public static void reverseStrings(char[] chars){
        int start = 0;
        int end = chars.length - 1;
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        String s = "australia";
        String revString = reverseUsingRecursion(s);
        System.out.println(revString);

        String reverseString = reverseString(s);
        System.out.println(reverseString);

        reverseStringUsingStack(s);

        System.out.println();
        char[] chars = s.toCharArray();
        reverseStrings(chars);
        System.out.println(chars);


    }
}
