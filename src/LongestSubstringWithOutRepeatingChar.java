import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeatingChar {
    public static int longestSubStringLength(String s){
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int length = s.length();
        int maxLength = 0;
        while(end < length){
           char ch = s.charAt(end);
           if(set.contains(ch)){
               set.remove(ch);
               start++;
           }
           set.add(ch);
           end++;
           maxLength = Math.max(maxLength,(end - start));
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestSubStringLength = longestSubStringLength(s);
        System.out.println(longestSubStringLength);
    }
}
