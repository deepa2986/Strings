import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueChars {

    public static int lengthOfLongestSubString(String s, int k){
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int maxCount = 0;
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.keySet().size() > k){
               char removeChar  = s.charAt(start);
               if(map.get(removeChar) == 1) {
                   map.remove(removeChar);
               } else {
                   map.put(removeChar,map.get(removeChar) - 1);
               }
               start++;
            }
            if(map.keySet().size() == k){
                maxCount = Math.max(maxCount,end - start + 1);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {

        String s = "frffcd";
        int k = 2;
        int length = lengthOfLongestSubString(s, k);
        System.out.println(length);

    }
}
