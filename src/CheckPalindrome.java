public class CheckPalindrome {

    public static void checkPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome)
            System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }

    public static void main(String[] args) {
        String s = "mommy";
        checkPalindrome(s);
    }
}
