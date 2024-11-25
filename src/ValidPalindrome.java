public class ValidPalindrome {

    public  static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while (start <= end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start)))
                start++;
            while (start < end && !Character.isLetterOrDigit(s.charAt(end)))
                end--;
            if(start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man a plan, a canal; panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }
}
