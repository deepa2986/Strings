import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static char findTheDifference(String s,String t){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch,map.get(ch)-1);
            }else return ch;
        }
        return ' ';
    }

    public static char findDiff(String s,String t){
        int i = 0;
        int length = s.length();
        int sum = 0;
        while (i < length){
            sum += t.charAt(i) - s.charAt(i);
            i++;
        }
        sum+=t.charAt(i);
        return (char) sum;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char theDifference = findTheDifference(s, t);
        System.out.println(theDifference);
    }
}
