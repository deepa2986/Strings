import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void firstNonRepeatingCharUsingHashMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }
    }

    public static void firstNonRepeatingCharLinkedHashMap(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i= 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        String s = "program";
        firstNonRepeatingCharUsingHashMap(s);
        firstNonRepeatingCharLinkedHashMap(s);

    }
}
