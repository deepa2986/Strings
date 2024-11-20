import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {


    public static int findFirstUniqueCharacter(String s){
        Map<Character,Integer> charCountMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            int count = charCountMap.get(s.charAt(i));
            if(count == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String s = "charhacter";
        int firstUniqueCharacter = findFirstUniqueCharacter(s);
        System.out.println(firstUniqueCharacter);
    }
}
