public class ReverseString {

    public static String reverseUsingRecursion(String s){
        if(s == null || s.length() <= 1){
            return s;
        }
        return reverseUsingRecursion(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String s = "australia";
    }
}
