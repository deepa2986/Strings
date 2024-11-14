import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithNonRepeatingChar {

    public static int findLongestSubStringLength(String s){
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxCount = 0;
        while (i < s.length() && j < s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
                maxCount = Math.max(maxCount,j-i);
            }else{
                char c = s.charAt(i);
                set.remove(c);
                i++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s = "abcabcb";
        int longestSubStringLength= findLongestSubStringLength(s);
        System.out.println(longestSubStringLength);
    }
}
